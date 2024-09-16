package uz.iskandarbek.fragment19

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton


class BlankFragment : Fragment() {
    lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root = inflater.inflate(R.layout.fragment_blank, container, false)
        val btn2 = root.findViewById<MaterialButton>(R.id.btn2)
        btn2.setOnClickListener {
            Toast.makeText(context, "Birinchi fragment ishlayapti", Toast.LENGTH_SHORT).show()
        }
        return root
    }
}