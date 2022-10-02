package com.pi.myapplication

import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.pi.myapplication.databinding.ActivityMainBinding
import com.yandex.div.core.Div2Context
import com.yandex.div.core.DivActionHandler
import com.yandex.div.core.DivConfiguration
import com.yandex.div.core.DivViewFacade
import com.yandex.div2.DivAction
import org.json.JSONObject

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val divContext = Div2Context(baseContext = this, configuration = createDivConfiguration())

        val allJsons = JSONObject(json.developerCards)
        val templatesJson = allJsons.getJSONObject("templates")
        val cardsJson = allJsons.getJSONArray("cards")
        val listAdapter = DivListAdapter(divContext, templatesJson, cardsJson)
        binding.rcDevelopers.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
        }

//        val allJsons = JSONObject(json.developerCards)
//        val templatesJson = allJsons.getJSONObject("templates")
//        val cardJson = allJsons.getJSONObject("card")
//        val factory = DivViewFactory(divContext, templatesJson)
//        val view = factory.createView(cardJson).apply {
//            layoutParams = ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT
//            )
//        }
//        binding.linearLayout.addView(view)
    }

    private fun createDivConfiguration(): DivConfiguration {
        return DivConfiguration.Builder(DivGlideImageLoader(this))
            .actionHandler(DemoDivActionHandler())
            .supportHyphenation(true)
            .visualErrorsEnabled(true)
            .build()
    }

    class DemoDivActionHandler : DivActionHandler() {
        override fun handleAction(action: DivAction, view: DivViewFacade): Boolean {
            return super.handleAction(action, view)
        }
    }
}