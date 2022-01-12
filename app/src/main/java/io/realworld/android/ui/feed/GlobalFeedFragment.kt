package io.realworld.android.ui.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import io.realworld.android.databinding.FragmentGlobalFeedBinding

class GlobalFeedFragment : Fragment() {

    private var _binding: FragmentGlobalFeedBinding? = null
    private lateinit var viewModel: FeedViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this)[FeedViewModel::class.java]
        _binding = FragmentGlobalFeedBinding.inflate(inflater, container, false)

        _binding?.fetchFeed?.setOnClickListener {
            viewModel.fetchGlobalFeed()
        }

        return _binding?.root
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}