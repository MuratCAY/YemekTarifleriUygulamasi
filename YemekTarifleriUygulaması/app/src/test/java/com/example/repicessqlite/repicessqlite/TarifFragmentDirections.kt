package com.example.repicessqlite

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class TarifFragmentDirections private constructor() {
  companion object {
    fun actionTarifFragmentToListeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_tarifFragment_to_listeFragment)
  }
}
