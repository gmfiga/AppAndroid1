package com.example.gabriel.appandroid_1


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitInfo()
    }

    fun submitInfo(){
        sendInfo.setOnClickListener{
            var name = UserNameInput.text
            var age = Age.text
            var movie = Movie.text

            Greeting.setText("Hey " + name + ". Thank you for the movie suggestion of " + movie +
                    " that you decided is the best movie" +
                    "in all your " + age + " years of experience!")
        }
    }
}
