package com.example.lifecycle.ui.gallery

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lifecycle.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("GalleryFragment","onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("GalleryFragment","OnCreate called")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        Log.i("GalleryFragment","OnCreateView called")
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("GalleryFragment","OnActivityCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("GalleryFragment","OnStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("GalleryFragment","OnResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("GalleryFragment","OnPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("GalleryFragment","OnStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.i("GalleryFragment","onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("GalleryFragment","onDestroy called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("GalleryFragment","onDetach called")
    }
}