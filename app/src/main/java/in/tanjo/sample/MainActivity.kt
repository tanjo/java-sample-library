package `in`.tanjo.sample

import `in`.tanjo.modeling.extension.fromJson
import `in`.tanjo.modeling.extension.toJson
import `in`.tanjo.sample.model.Hoge
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hoge = Hoge.fromJson("{\"fuga\":\"寿司が食べたい\"}")

        val textView = this.findViewById<TextView>(R.id.activity_main_textview)

        val hogeString = hoge?.let { hoge.toJson() } ?: "Not working"

        val fugaString = hoge?.let { hoge.fuga } ?: "null"

        val text = "${fugaString}\n${hogeString}"

        textView.text = text

        val hoge2 = Hoge("piyo")
        Log.i("in.tanjo.sample", hoge2.toJson()) // {"fuga":"piyo"}

        val hoge3 = Hoge.fromJson(null)
        Log.i("in.tanjo.sample", hoge3?.toJson() ?: "hoge3 is null.") // hoge3 is null.
    }
}
