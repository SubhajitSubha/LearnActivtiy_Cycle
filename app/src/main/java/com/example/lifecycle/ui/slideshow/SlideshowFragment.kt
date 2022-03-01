package com.example.lifecycle.ui.slideshow

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lifecycle.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("SlideShowFragment","onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("SlideShowFragment","OnCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSlideshow
        slideshowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        Log.i("SlideShowFragment","OnCreateView Called")
        return root
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("SlideShowFragment","OnActivityCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("SlideShowFragment","OnStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SlideShowFragment","OnResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("SlideShowFragment","OnPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SlideShowFragment","OnStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.i("SlideShowFragment","onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SlideShowFragment","onDestroy called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("SlideShowFragment","onDetach called")
    }
}