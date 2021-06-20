package com.example.memeshareapp
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
//import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadMeme()
    }
    private fun loadMeme() {
        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://meme-api.herokuapp.com/gimme"
//        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
//            Response.Listener{ response ->
//                var url = response.getString("url")
//                Glide.with(this).load(url).into(meme)
//            },
//            {
//                Toast.makeText(this,"Something went wrong", Toast.LENGTH_LONG).show()
//            }
//        )

        // Add the request to the RequestQueue.
        queue.add(jsonObjectRequest)
    }

    fun shareMeme(view: View) {}
    fun nextMeme(view: View) {}


}
