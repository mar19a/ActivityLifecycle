package com.example.activitylifecycle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "LifecycleMainActivity"
        private const val TEXT_VIEW_KEY = "textViewKey"
    }

    private lateinit var editText: EditText
    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate called")

        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        if (savedInstanceState != null) {
            textView.text = savedInstanceState.getString(TEXT_VIEW_KEY)
        }

        button.setOnClickListener {
            val text = "Hello"
            textView.text = text
            editText.setText(text)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Save the state of the TextView
        outState.putString(TEXT_VIEW_KEY, textView.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        // Restore the state of the TextView
        textView.text = savedInstanceState.getString(TEXT_VIEW_KEY)
    }
}