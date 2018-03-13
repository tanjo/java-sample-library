package `in`.tanjo.sample

import `in`.tanjo.modeling.extension.fromJson
import `in`.tanjo.modeling.extension.toJson
import `in`.tanjo.sample.model.Hoge
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hoge = Hoge.fromJson("{\"fuga\":\"寿司が食べたい\"")

        val textView = this.findViewById<TextView>(R.id.activity_main_textview)

        val hogeString = hoge?.let { hoge.toJson() } ?: "Not working"

        textView.text = hogeString
    }
}
