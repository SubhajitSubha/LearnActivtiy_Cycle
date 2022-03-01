package com.example.lifecycle.ui.home

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lifecycle.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("HomeFragment","onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("HomeFragment","OnCreate called")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        Log.i("HomeFragment","OnCreateView Called")
        return root
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i("HomeFragment","OnActivityCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("HomeFragment","OnStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("HomeFragment","OnResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("HomeFragment","OnPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("HomeFragment","OnStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.i("HomeFragment","onDestroyView called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("HomeFragment","onDestroy called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("HomeFragment","onDetach called")
    }
}