package com.pi.myapplication

object json {
    const val habrCards =
"""
{
  "templates": {
    "habr_card": {
      "type": "container",
      "background": [
        {
          "type": "solid",
          "color": "#FFF"
        }
      ],
      "paddings": {
        "left": 16,
        "top": 16,
        "right": 16,
        "bottom": 16
      },
      "margins": {
        "bottom": 8
      },
      "items": [
        {
          "type": "container",
          "orientation": "horizontal",
          "items": [
            {
              "type": "user_avatar",
              "${'$'}image_url": "avatar"
            },
            {
              "type": "user_name",
              "${'$'}text": "username"
            },
            {
              "type": "time",
              "${'$'}text": "time"
            }
          ],
          "margins": {
            "bottom": 8
          }
        },
        {
          "type": "title",
          "${'$'}text": "title"
        },
        {
          "type": "container",
          "orientation": "horizontal",
          "items": [
            {
              "type": "footer_icon",
              "image_url": "https://yastatic.net/s3/home/yandex-app/div_demo/diamond.png"
            },
            {
              "type": "footer_text",
              "text_color": "#7AA600",
              "${'$'}text": "votes"
            },
            {
              "type": "footer_space"
            },
            {
              "type": "footer_icon",
              "image_url": "https://yastatic.net/s3/home/yandex-app/div_demo/eye.png"
            },
            {
              "type": "footer_text",
              "${'$'}text": "views"
            },
            {
              "type": "footer_space"
            },
            {
              "type": "footer_icon",
              "image_url": "https://yastatic.net/s3/home/yandex-app/div_demo/flag.png"
            },
            {
              "type": "footer_text",
              "${'$'}text": "favorites"
            },
            {
              "type": "footer_space"
            },
            {
              "type": "footer_icon",
              "image_url": "https://yastatic.net/s3/home/yandex-app/div_demo/bubble.png"
            },
            {
              "type": "footer_text",
              "${'$'}text": "comments"
            }
          ]
        }
      ],
      "orientation": "vertical"
    },
    "user_name": {
      "type": "text",
      "font_size": 13,
      "text_color": "#414b50",
      "font_weight": "medium",
      "width": {
        "type": "wrap_content"
      },
      "alignment_vertical": "center",
      "margins": {
        "right": 5
      }
    },
    "user_avatar": {
      "type": "image",
      "width": {
        "type": "fixed",
        "value": 24
      },
      "height": {
        "type": "fixed",
        "value": 24
      },
      "border": {
        "corner_radius": 3
      },
      "margins": {
        "right": 5
      }
    },
    "time": {
      "type": "text",
      "font_size": 13,
      "text_color": "#777",
      "width": {
        "type": "wrap_content"
      },
      "alignment_vertical": "center",
      "margins": {
        "right": 5
      }
    },
    "title": {
      "type": "text",
      "font_size": 20,
      "text_color": "#333",
      "line_height": 23,
      "font_weight": "medium",
      "margins": {
        "bottom": 20
      }
    },
    "footer_icon": {
      "type": "image",
      "scale": "fit",
      "width": {
        "type": "fixed",
        "value": 24
      },
      "height": {
        "type": "fixed",
        "value": 24
      },
      "border": {
        "corner_radius": 3
      },
      "paddings": {
        "top": 2,
        "bottom": 2,
        "left": 2,
        "right": 2
      }
    },
    "footer_text": {
      "type": "text",
      "font_size": 13,
      "text_color": "#BDCDD6",
      "font_weight": "medium",
      "width": {
        "type": "wrap_content"
      },
      "margins": {
        "left": 4
      },
      "alignment_vertical": "center"
    },
    "footer_space": {
      "type": "separator",
      "width": {
        "type": "match_parent",
        "weight": 1
      },
      "delimiter_style": {
        "color": "#0000"
      }
    }
  },
  "cards": [
    {
      "log_id": "div2_sample_card0",
      "states": [
        {
          "state_id": 0,
          "div": {
            "type": "container",
            "background": [
              {
                "type": "solid",
                "color": "#F0F0F0"
              }
            ],
            "items": [
              {
                "type": "habr_card",
                "avatar": "https://habrastorage.org/r/w32/getpro/habr/avatars/fc3/f8c/b5f/fc3f8cb5ff62a37139359296fcb2626a.jpg",
                "username": "svipy",
                "time": "14 июля в 10:57",
                "title": "Пишем онлайн-тренажёр для Python, C++ и Go: опыт Практикума",
                "votes": "+21",
                "comments": "4",
                "views": "6.9K",
                "favorites": "39"
              }
            ]
          }
        }
      ]
    },
    {
      "log_id": "div2_sample_card1",
      "states": [
        {
          "state_id": 0,
          "div": {
            "type": "container",
            "background": [
              {
                "type": "solid",
                "color": "#F0F0F0"
              }
            ],
            "items": [
              {
                "type": "habr_card",
                "avatar": "https://habrastorage.org/r/w32/getpro/habr/avatars/ba8/258/251/ba825825164ffb969217c5bd71ebcc3e.png",
                "username": "danis_gaiazov",
                "time": "6 июля в 10:59",
                "title": "Как люди помогают технологиям в Яндекс Картах\n",
                "votes": "+20",
                "comments": "19 +19",
                "views": "4.7K",
                "favorites": "17"
              }
            ]
          }
        }
      ]
    },
    {
      "log_id": "div2_sample_card2",
      "states": [
        {
          "state_id": 0,
          "div": {
            "type": "container",
            "background": [
              {
                "type": "solid",
                "color": "#F0F0F0"
              }
            ],
            "items": [
              {
                "type": "habr_card",
                "avatar": "https://habrastorage.org/r/w32/getpro/habr/avatars/227/251/bb4/227251bb43ef457fb2873c8ff5baa879.jpg",
                "username": "yupych",
                "time": "28 июня в 11:01",
                "title": "Апериодическая решётка Яндекс Станции 2: история, 3D-модели и акустические эксперименты",
                "votes": "+110",
                "comments": "72 +72",
                "views": "22K",
                "favorites": "59"
              }
            ]
          }
        }
      ]
    },
    {
      "log_id": "div2_sample_card3",
      "states": [
        {
          "state_id": 0,
          "div": {
            "type": "container",
            "background": [
              {
                "type": "solid",
                "color": "#F0F0F0"
              }
            ],
            "items": [
              {
                "type": "habr_card",
                "avatar": "https://habrastorage.org/r/w32/getpro/habr/avatars/61d/5cd/b27/61d5cdb270de9e77df080b1d4eedb606.jpg",
                "username": "MichaelEk",
                "time": "23 июня в 10:59",
                "title": "Яндекс выложил YaLM 100B — сейчас это крупнейшая GPT-подобная нейросеть в свободном доступе. Вот как удалось её обучить",
                "votes": "+163",
                "comments": "134",
                "views": "70K",
                "favorites": "206"
              }
            ]
          }
        }
      ]
    }
  ]
}
"""
    const val myCard =
"""
{
    "templates": {
        "title": {
            "type": "text",
            "font_size": 20,
            "line_height": 24,
            "font_weight": "bold",
            "paddings": {
                "left": 24,
                "right": 24,
                "bottom": 8
            }
        },
        "subtitle": {
            "font_size": 15,
            "line_height": 20,
            "type": "text",
            "paddings": {
                "left": 24,
                "right": 24
            }
        },
        "text_block": {
            "type": "text",
            "text_color": "#ffffff",
            "height": {
                "type": "fixed",
                "value": 184
            },
            "paddings": {
                "left": 16,
                "right": 16,
                "bottom": 16
            },
            "margins": {
                "left": 24,
                "right": 24,
                "bottom": 16
            },
            "text_alignment_vertical": "bottom",
            "font_size": 15,
            "line_height": 20
        }
    },
    "card": {
        "log_id": "sample_card",
        "states": [
            {
                "state_id": 0,
                "div": {
                    "type": "container",
                    "orientation": "vertical",
                    "margins": {
                        "top": 24,
                        "bottom": 24
                    },
                    "items": [
                        {
                            "type": "title",
                            "text": "Background"
                        },
                        {
                            "type": "subtitle",
                            "text": "It can be a solid color, gradient, or an image. You can also overlay multiple backgrounds on top of each other.",
                            "margins": {
                                "bottom": 24
                            }
                        },
                        {
                            "type": "container",
                            "orientation": "vertical",
                            "items": [
                                {
                                    "type": "text_block",
                                    "height": {
                                        "type": "fixed",
                                        "value": 150
                                    },
                                    "background": [
                                        {
                                            "type": "solid",
                                            "color": "#C4C4C4",
                                            "angle": 270
                                        }
                                    ],
                                    "text_alignment_vertical": "bottom",
                                    "text": "Solid background"
                                },
                                {
                                    "type": "text_block",
                                    "height": {
                                        "type": "fixed",
                                        "value": 150
                                    },
                                    "background": [
                                        {
                                            "type": "gradient",
                                            "colors": [
                                                "#0fff",
                                                "#000"
                                            ],
                                            "angle": 270
                                        }
                                    ],
                                    "text_alignment_vertical": "bottom",
                                    "text": "Gradient"
                                },
                                {
                                    "type": "text_block",
                                    "height": {
                                        "type": "fixed",
                                        "value": 150
                                    },
                                    "background": [
                                        {
                                            "type": "image",
                                            "image_url": "https://yastatic.net/s3/home/yandex-app/div_demo/containers.png"
                                        }
                                    ],
                                    "text_alignment_vertical": "bottom",
                                    "text": "Image"
                                },
                                {
                                    "type": "text_block",
                                    "height": {
                                        "type": "fixed",
                                        "value": 150
                                    },
                                    "background": [
                                        {
                                            "type": "image",
                                            "image_url": "https://yastatic.net/s3/home/yandex-app/div_demo/containers.png"
                                        },
                                        {
                                            "type": "gradient",
                                            "colors": [
                                                "#0fff",
                                                "#000"
                                            ],
                                            "angle": 270
                                        }
                                    ],
                                    "text_alignment_vertical": "bottom",
                                    "text": "Gradient and image"
                                },
                                {
                                    "type": "text_block",
                                    "height": {
                                        "type": "fixed",
                                        "value": 150
                                    },
                                    "background": [
                                        {
                                            "type": "image",
                                            "image_url": "https://yastatic.net/s3/home/yandex-app/div_demo/containers.png"
                                        },
                                        {
                                            "type": "gradient",
                                            "colors": [
                                                "#0fff",
                                                "#000"
                                            ],
                                            "angle": 270
                                        }
                                    ],
                                    "text_alignment_vertical": "bottom",
                                    "text": "Gradient and image"
                                }
                            ]
                        }
                    ]
                }
            }
        ]
    }
}
"""
    const val developerCards =
"""
 {
  "templates": {
    "developer": {
      "type": "container",
      "background": [
        {
          "type": "solid",
          "color": "#FFF"
        }
      ],
      "paddings": {
        "left": 16,
        "top": 16,
        "right": 16,
        "bottom": 16
      },
      "margins": {
        "bottom": 8
      },
      "items": [
        {
          "type": "container",
          "orientation": "horizontal",
          "items": [
            {
              "type": "user_avatar",
              "${'$'}image_url": "avatar"
            },
            {
              "type": "user_name",
              "${'$'}text": "username"
            }
          ],
          "margins": {
            "bottom": 8
          }
        },
        {
          "type": "title",
          "${'$'}text": "title"
        },
        {
          "type": "footer_icon",
          "${'$'}image_url": "footerUrl",
          "alignment_horizontal": "right"
        }
      ],
      "orientation": "vertical"
    },
    "user_name": {
      "type": "text",
      "font_size": 13,
      "text_color": "#414b50",
      "font_weight": "medium",
      "width": {
        "type": "wrap_content"
      },
      "alignment_vertical": "center",
      "margins": {
        "right": 5
      }
    },
    "user_avatar": {
      "type": "image",
      "width": {
        "type": "fixed",
        "value": 48
      },
      "height": {
        "type": "fixed",
        "value": 48
      },
      "border": {
        "corner_radius": 24
      },
      "margins": {
        "right": 5
      }
    },
    "title": {
      "height": {
        "type": "wrap_content"
      },
      "type": "text",
      "font_size": 20,
      "text_color": "#333",
      "line_height": 23,
      "font_weight": "medium",
      "margins": {
        "bottom": 20
      }
    },
    "footer_icon": {
      "type": "image",
      "height": {
        "type": "fixed",
        "value": 16
      },
      "width": {
        "type": "fixed",
        "value": 16
      }
    }
  },
  "cards": [
    {
      "log_id": "developer_card1",
      "states": [
        {
          "state_id": 0,
          "div": {
            "type": "container",
            "background": [
              {
                "type": "solid",
                "color": "#F0F0F0"
              }
            ],
            "items": [
              {
                "type": "state",
                "div_id": "developer",
                "states": [
                  {
                    "state_id": "1",
                    "div": {
                      "type": "developer",
                      "avatar": "https://api.lorem.space/image/album?w=150&h=150",
                      "username": "Джим Хокинс",
                      "title": "Молодой парень, первый узнавший о сокровищах от старого пирата.",
                      "footerUrl": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAABmJLR0QA/wD/AP+gvaeTAAAAXUlEQVRIie3SMQrAIBAF0SGFZ9+cI2fTnCJoYQoJC2lUFP4Dm2XEwgUREdlJAE4gARGwdza6w4D8OTahIznhPao7mjA7lx9n1qVrH76ccMaMQP2DyP/S9OxERGRRBc7xO7QYAA6wAAAAAElFTkSuQmCC",
                      "actions": [
                        {
                          "log_id": "switch_state1",
                          "url": "div-action://set_state?state_id=0/developer/2"
                        }
                      ]
                    }
                  },
                  {
                    "state_id": "2",
                    "div": {
                      "type": "developer",
                      "avatar": "https://api.lorem.space/image/album?w=150&h=150",
                      "username": "Джим Хокинс",
                      "title": "Молодой парень, первый узнавший о сокровищах от старого пирата. Он отправляется за сокровищами на корабле в качестве юнги. Честный и правильный, немного горяч, но смел и умён. Он всегда оказывается в центре событий. Предусмотрительный, добрый, воспитанный мальчик. Оказавшись на острове, Джим сумел увести корабль в безопасное место, понимая неизбежность “войны”. Попав в руки Сильвера, становится причиной ссоры между ним и пиратами. Сильверу вручают чёрную метку. Благодаря знакомству Джима и Бена Ганна, их путешествие заканчивается удачно.",
                      "footerUrl": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAABmJLR0QA/wD/AP+gvaeTAAAAsklEQVRIie2WSwqAMAxER+9g0fsfR1e68Di6aUHFTyYdKKgDWbXjSyNNA/z6qgKAIUbI8PeMvwEwAlhizAA6Aur2DxtTigm2zEPce/T3XrAFfgU1g4+l2sZV2Z48rQXMwmVQBi6HJt39t+lhzXMNd7o7lfykXrgUaoVT0FqcXCX+HlVqpr1KoFJ4ketkaQ6e9poNte41wz1tUAIv9iwWGwTORhemDWb5Q8ySGtaE/l8v0ArSo+eVYaS+0wAAAABJRU5ErkJggg==",
                      "actions": [
                        {
                          "log_id": "switch_state1",
                          "url": "div-action://set_state?state_id=0/developer/1"
                        }
                      ]
                    }
                  }
                ]
              }
            ]
          }
        }
      ]
    },
    {
      "log_id": "developer_card2",
      "states": [
        {
          "state_id": 0,
          "div": {
            "type": "container",
            "background": [
              {
                "type": "solid",
                "color": "#F0F0F0"
              }
            ],
            "items": [
              {
                "type": "state",
                "div_id": "developer",
                "states": [
                  {
                    "state_id": "1",
                    "div": {
                      "type": "developer",
                      "avatar": "https://api.lorem.space/image/album?w=150&h=150",
                      "username": "Сквайр Трелони",
                      "title": "Богатый человек, жаждущий приключений.",
                      "footerUrl": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAABmJLR0QA/wD/AP+gvaeTAAAAXUlEQVRIie3SMQrAIBAF0SGFZ9+cI2fTnCJoYQoJC2lUFP4Dm2XEwgUREdlJAE4gARGwdza6w4D8OTahIznhPao7mjA7lx9n1qVrH76ccMaMQP2DyP/S9OxERGRRBc7xO7QYAA6wAAAAAElFTkSuQmCC",
                      "actions": [
                        {
                          "log_id": "switch_state1",
                          "url": "div-action://set_state?state_id=0/developer/2"
                        }
                      ]
                    }
                  },
                  {
                    "state_id": "2",
                    "div": {
                      "type": "developer",
                      "avatar": "https://api.lorem.space/image/album?w=150&h=150",
                      "username": "Сквайр Трелони",
                      "title": "Богатый человек, жаждущий приключений. За его средства был куплен корабль, оплачена поездка. Трелони стремится стать лидером, но ему не хватает специальных знаний, выдержки, мудрости. Он настолько болтлив, что рассказал всему городу о поездке за сокровищами Флинта. Из-за этого в команду попало много пиратов и разбойников. Хорошо стреляет.",
                      "footerUrl": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAABmJLR0QA/wD/AP+gvaeTAAAAsklEQVRIie2WSwqAMAxER+9g0fsfR1e68Di6aUHFTyYdKKgDWbXjSyNNA/z6qgKAIUbI8PeMvwEwAlhizAA6Aur2DxtTigm2zEPce/T3XrAFfgU1g4+l2sZV2Z48rQXMwmVQBi6HJt39t+lhzXMNd7o7lfykXrgUaoVT0FqcXCX+HlVqpr1KoFJ4ketkaQ6e9poNte41wz1tUAIv9iwWGwTORhemDWb5Q8ySGtaE/l8v0ArSo+eVYaS+0wAAAABJRU5ErkJggg==",
                      "actions": [
                        {
                          "log_id": "switch_state1",
                          "url": "div-action://set_state?state_id=0/developer/1"
                        }
                      ]
                    }
                  }
                ]
              }
            ]
          }
        }
      ]
    },
    {
      "log_id": "developer_card3",
      "states": [
        {
          "state_id": 0,
          "div": {
            "type": "container",
            "background": [
              {
                "type": "solid",
                "color": "#F0F0F0"
              }
            ],
            "items": [
              {
                "type": "state",
                "div_id": "developer",
                "states": [
                  {
                    "state_id": "1",
                    "div": {
                      "type": "developer",
                      "avatar": "https://api.lorem.space/image/album?w=150&h=150",
                      "username": "Дэвид Ливси",
                      "title": "Очень мужественный, смелый человек, готов умереть, защищая товарища.",
                      "footerUrl": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAABmJLR0QA/wD/AP+gvaeTAAAAXUlEQVRIie3SMQrAIBAF0SGFZ9+cI2fTnCJoYQoJC2lUFP4Dm2XEwgUREdlJAE4gARGwdza6w4D8OTahIznhPao7mjA7lx9n1qVrH76ccMaMQP2DyP/S9OxERGRRBc7xO7QYAA6wAAAAAElFTkSuQmCC",
                      "actions": [
                        {
                          "log_id": "switch_state1",
                          "url": "div-action://set_state?state_id=0/developer/2"
                        }
                      ]
                    }
                  },
                  {
                    "state_id": "2",
                    "div": {
                      "type": "developer",
                      "avatar": "https://api.lorem.space/image/album?w=150&h=150",
                      "username": "Дэвид Ливси",
                      "title": "Очень мужественный, смелый человек, готов умереть, защищая товарища. Работает судьёй. Отличный врач, умный, дальновидный человек. Именно ему отдаёт карту Джим, взяв её у умершего Билли. Это самый надёжный человек, которого мог выбрать Джим. В обмен на жизнь Джима Ливси отдаёт Сильверу карту. Обещает спасти его от виселицы, которая ему обеспечена, если тот вернётся домой.",
                      "footerUrl": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAABmJLR0QA/wD/AP+gvaeTAAAAsklEQVRIie2WSwqAMAxER+9g0fsfR1e68Di6aUHFTyYdKKgDWbXjSyNNA/z6qgKAIUbI8PeMvwEwAlhizAA6Aur2DxtTigm2zEPce/T3XrAFfgU1g4+l2sZV2Z48rQXMwmVQBi6HJt39t+lhzXMNd7o7lfykXrgUaoVT0FqcXCX+HlVqpr1KoFJ4ketkaQ6e9poNte41wz1tUAIv9iwWGwTORhemDWb5Q8ySGtaE/l8v0ArSo+eVYaS+0wAAAABJRU5ErkJggg==",
                      "actions": [
                        {
                          "log_id": "switch_state1",
                          "url": "div-action://set_state?state_id=0/developer/1"
                        }
                      ]
                    }
                  }
                ]
              }
            ]
          }
        }
      ]
    },
    {
      "log_id": "developer_card4",
      "states": [
        {
          "state_id": 0,
          "div": {
            "type": "container",
            "background": [
              {
                "type": "solid",
                "color": "#F0F0F0"
              }
            ],
            "items": [
              {
                "type": "state",
                "div_id": "developer",
                "states": [
                  {
                    "state_id": "1",
                    "div": {
                      "type": "developer",
                      "avatar": "https://api.lorem.space/image/album?w=150&h=150",
                      "username": "Джон Сильвер",
                      "title": "Нанимается в качестве кока на судно к доктору Ливси.",
                      "footerUrl": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAABmJLR0QA/wD/AP+gvaeTAAAAXUlEQVRIie3SMQrAIBAF0SGFZ9+cI2fTnCJoYQoJC2lUFP4Dm2XEwgUREdlJAE4gARGwdza6w4D8OTahIznhPao7mjA7lx9n1qVrH76ccMaMQP2DyP/S9OxERGRRBc7xO7QYAA6wAAAAAElFTkSuQmCC",
                      "actions": [
                        {
                          "log_id": "switch_state1",
                          "url": "div-action://set_state?state_id=0/developer/2"
                        }
                      ]
                    }
                  },
                  {
                    "state_id": "2",
                    "div": {
                      "type": "developer",
                      "avatar": "https://api.lorem.space/image/album?w=150&h=150",
                      "username": "Джон Сильвер",
                      "title": "Нанимается в качестве кока на судно к доктору Ливси. Ходит с костылём на “деревянной” ноге. Хитрый, жадный, ставит деньги во главе всего. Для него нет ничего святого: ни дружба, ни верность слову,ни  благородств:  он старый пират. Он тайно командует пиратами на борту, планирует убить всех “лишних”, после того, как сокровища будут найдены. Получив на острове чёрную метку, решает переметнуться на сторону тех, кто скорее всего победит. Спасает Хокинса от смерти.",
                      "footerUrl": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB4AAAAeCAYAAAA7MK6iAAAABmJLR0QA/wD/AP+gvaeTAAAAsklEQVRIie2WSwqAMAxER+9g0fsfR1e68Di6aUHFTyYdKKgDWbXjSyNNA/z6qgKAIUbI8PeMvwEwAlhizAA6Aur2DxtTigm2zEPce/T3XrAFfgU1g4+l2sZV2Z48rQXMwmVQBi6HJt39t+lhzXMNd7o7lfykXrgUaoVT0FqcXCX+HlVqpr1KoFJ4ketkaQ6e9poNte41wz1tUAIv9iwWGwTORhemDWb5Q8ySGtaE/l8v0ArSo+eVYaS+0wAAAABJRU5ErkJggg==",
                      "actions": [
                        {
                          "log_id": "switch_state1",
                          "url": "div-action://set_state?state_id=0/developer/1"
                        }
                      ]
                    }
                  }
                ]
              }
            ]
          }
        }
      ]
    }
  ]
}
"""
}