package com.example.yogaasanas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var asanaImage: ImageView
    lateinit var asanaInfo: TextView
    lateinit var asanaTitle: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        asanaImage = findViewById(R.id.image_view)
        asanaInfo = findViewById(R.id.asana_info)
        asanaTitle = findViewById(R.id.asana_title)
        val asanaButton1: ImageButton = findViewById(R.id.imageButton1)
        asanaButton1.setOnClickListener {
            asanaImage.setImageResource(R.drawable.savasana)
            asanaInfo.text = "Shavasana, Corpse Pose, or Mrtasana, is an asana in hatha yoga and modern yoga as exercise, often used for relaxation at the end of a session. It is the usual pose for the practice of yoga nidra meditation."
            asanaTitle.text = "Savasana"
        }
        val asanaButton2: ImageButton = findViewById(R.id.imageButton2)
        asanaButton2.setOnClickListener {
            asanaImage.setImageResource(R.drawable.tree_pose)
            asanaInfo.text="Vrikshasana or Tree Pose is a balancing asana. It is one of the very few standing poses in medieval hatha yoga, and remains popular in modern yoga as exercise."
            asanaTitle.text = "Vrikshasana"
        }
        val asanaButton3: ImageButton = findViewById(R.id.imageButton3)
        asanaButton3.setOnClickListener {
            asanaImage.setImageResource(R.drawable.vajrasana)
            asanaInfo.text="Vajrasana, Thunderbolt Pose, or Diamond Pose, is a kneeling asana in hatha yoga and modern yoga as exercise. Medieval texts describe a variety of poses under this name."
            asanaTitle.text = "Vajrasana"
        }
        val asanaButton4: ImageButton = findViewById(R.id.imageButton4)
        asanaButton4.setOnClickListener {
            asanaImage.setImageResource(R.drawable.downward_dog)
            asanaInfo.text="Downward Dog Pose or Downward-facing Dog Pose, also called Adho Mukha Shvanasana, is an inversion asana, often practised as part of a flowing sequence of poses, especially Surya Namaskar, the Salute to the Sun. The asana is commonly used in modern yoga as exercise."
            asanaTitle.text = "Adho Mukha Shvanasana"
        }

    }
}