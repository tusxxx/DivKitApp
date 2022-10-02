package com.pi.myapplication

import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import androidx.core.net.toUri
import com.bumptech.glide.Glide
import com.bumptech.glide.request.Request
import com.bumptech.glide.request.RequestFutureTarget
import com.bumptech.glide.request.target.Target
import com.bumptech.glide.request.transition.Transition
import com.yandex.div.core.images.BitmapSource
import com.yandex.div.core.images.CachedBitmap
import com.yandex.div.core.images.DivImageDownloadCallback
import com.yandex.div.core.images.DivImageLoader
import com.yandex.div.core.images.LoadReference

class DivGlideImageLoader(private val context: Context) : DivImageLoader {
    private val requestManager = Glide.with(context)

    override fun loadImage(imageUrl: String, callback: DivImageDownloadCallback): LoadReference {
        val target = DownloadCallbackAdapter(imageUrl.toUri(), callback)
        requestManager.load(imageUrl).into(target)
        return LoadReference { requestManager.clear(target) }
    }

    override fun loadImage(imageUrl: String, imageView: ImageView): LoadReference {
        requestManager.load(imageUrl).into(imageView)
        return LoadReference { requestManager.clear(imageView) }
    }

    override fun loadImageBytes(
        imageUrl: String,
        callback: DivImageDownloadCallback
    ): LoadReference = loadImage(imageUrl, callback)

    private inner class DownloadCallbackAdapter(
        private val imageUri: Uri,
        private val callback: DivImageDownloadCallback
    ) : RequestFutureTarget<Drawable>(
        Target.SIZE_ORIGINAL,
        Target.SIZE_ORIGINAL
    ) {
        override fun onStart() = Unit
        override fun onStop() = Unit
        override fun onDestroy() = Unit
        override fun onLoadFailed(errorDrawable: Drawable?) = Unit
        override fun setRequest(request: Request?) = Unit
        override fun getRequest(): Request? = null
        override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
            callback.onSuccess(CachedBitmap(resource.toBitmap(), imageUri, BitmapSource.NETWORK))
        }
    }
}