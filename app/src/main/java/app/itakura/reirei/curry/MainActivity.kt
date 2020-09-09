package app.itakura.reirei.curry

import android.graphics.RenderNode
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {

    val people = arrayOf("A君", "B君", "C君", "D君","E君")
    val food = arrayOf("マカロン", "パフェ", "スパゲッティ", "アイスクリーム")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {



                val Randomname = Random()
                val index = Randomname.nextInt(5)
                val name = people[index]

                whoText.text = name + "と"

                foodText.text = food[Random().nextInt(4)] + "を"

                val Random =Random().nextInt(2)
                when( Random) {
                    0-> {
                        text.text = "食べました"
                    }

                    1-> {
                        text.text = "食べられませんでした"
                        text.setTextSize(50F)
                    }
                }


        }

    }


}


