package com.meuprimeiro.testsportheca.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.meuprimeiro.testsportheca.databinding.FragmentProfileBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfileFragment: Fragment() {

    private var _binding: FragmentProfileBinding ? = null
    private val binding get() = _binding!!
    private val profileViewModel: ProfileViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        setObservables()
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setObservables() {
        profileViewModel.profile.observe(viewLifecycleOwner) {
            it?.let {

            }
            binding.apply {
                txtName.text = it.name
                txtCountry.text = it.country
                txtPosition.text = it.pos
                txtPercentage.text = it.percentage.toString()
                progressBarWon.apply {
                    progress = it.bars?.worldCupsWon?.pla?.toInt() ?: 0
                    max = it.bars?.worldCupsWon?.max?.toInt() ?: 0
                }
                txtWonPosition.text = it.bars?.worldCupsWon?.pos.toString()

                progressBarDisputed.apply {
                    progress = it.bars?.worldCupsDisputed?.pla?.toInt() ?: 0
                    max = it.bars?.worldCupsDisputed?.max?.toInt() ?: 0
                }
                txtWonDisputed.text = it.bars?.worldCupsDisputed?.pos.toString()

                Glide
                    .with(this@ProfileFragment)
                    .load(it.img)
                    .circleCrop()
                    .into(imageView3)
            }
        }
    }
}