package com.example.cal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var n2 = 0
    var num = 0
    var cl = ""
    var totl = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nine.setOnClickListener {
            if (show.text.toString() == "0" || n2 == 1) {
                show.setText("9")
                n2 = 0
            } else {
                var nm9 = show.text.toString().plus(9)
                show.setText(nm9)
            }
        }

        eight.setOnClickListener {
            if (show.text.toString() == "0" || n2 == 1) {
                show.setText("8")
                n2 = 0
            } else {
                var nm8 = show.text.toString().plus(8)
                show.setText(nm8)
            }
        }

        seven.setOnClickListener {
            if (show.text.toString() == "0" || n2 == 1) {
                show.setText("7")
                n2 = 0
            } else {
                var nm7 = show.text.toString().plus(7)
                show.setText(nm7)
            }
        }

        six.setOnClickListener {
            if (show.text.toString() == "0" || n2 == 1) {
                show.setText("6")
                n2 = 0
            } else {
                var nm6 = show.text.toString().plus(6)
                show.setText(nm6)
            }
        }

        five.setOnClickListener {
            if (show.text.toString() == "0" || n2 == 1) {
                show.setText("5")
                n2 = 0
            } else {
                var nm5 = show.text.toString().plus(5)
                show.setText(nm5)
            }
        }

        four.setOnClickListener {
            if (show.text.toString() == "0" || n2 == 1) {
                show.setText("4")
                n2 = 0
            } else {
                var nm4 = show.text.toString().plus(4)
                show.setText(nm4)
            }
        }

        three.setOnClickListener {
            if (show.text.toString() == "0" || n2 == 1) {
                show.setText("3")
                n2 = 0
            } else {
                var nm3 = show.text.toString().plus(3)
                show.setText(nm3)
            }
        }

        two.setOnClickListener {
            if (show.text.toString() == "0" || n2 == 1) {
                show.setText("2")
                n2 = 1
            } else {
                var nm2 = show.text.toString().plus(2)
                show.setText(nm2)
            }
        }

        one.setOnClickListener {
            if (show.text.toString() == "0" || n2 == 1) {
                show.setText("1")
                n2 = 1
            } else {
                var nm1 = show.text.toString().plus(1)
                show.setText(nm1)
            }
        }

        zero.setOnClickListener {
            if (show.text.toString() == "0" || n2 == 1) {
                show.setText("0")
                n2 = 0
            } else {
                var nm = show.text.toString().plus(0)
                show.setText(nm)
            }
        }

        clear.setOnClickListener {
            show.setText("0")
        }

        dot.setOnClickListener {
            if (show.text.toString() == "0") {
                show.setText("0.")
            } else {
                var dt = show.text.toString().plus(".")
                show.setText(dt)
            }
        }


        del.setOnClickListener {
            if (show.text.toString().length <= 1) {
                show.setText("0")
            } else {
                show.text = show.text.dropLast(1)
            }
        }

        mu.setOnClickListener {
            n2 = 1
            num = show.text.toString().toInt()
            cl = "mu"
        }
        de.setOnClickListener {
            n2 = 1
            num = show.text.toString().toInt()
            cl = "de"
        }
        plus.setOnClickListener {
            n2 = 1
            num = show.text.toString().toInt()
            cl = "plus"
        }
        slash.setOnClickListener {
            n2 = 1
            num = show.text.toString().toInt()
            cl = "sl"
        }

        tot.setOnClickListener {
            if (cl == "mu") {
                totl = num * show.text.toString().toInt()
                show.text = totl.toString()
            } else if (cl == "de") {
                totl = num - show.text.toString().toInt()
                show.text = totl.toString()
            } else if (cl == "plus") {
                totl = num + show.text.toString().toInt()
                show.text = totl.toString()
            } else if (cl == "sl") {
                totl = num / show.text.toString().toInt()
                show.text = totl.toString()
            }

        }
            }
        }




