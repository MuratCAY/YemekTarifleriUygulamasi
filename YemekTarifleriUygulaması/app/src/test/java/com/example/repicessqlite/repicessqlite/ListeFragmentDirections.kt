package com.example.repicessqlite

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

class ListeFragmentDirections private constructor() {
  private data class ActionListeFragmentToTarifFragment(
    val bilgi: String = "menudengeldim",
    val id: Int = 0
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_listeFragment_to_tarifFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("bilgi", this.bilgi)
      result.putInt("id", this.id)
      return result
    }
  }

  companion object {
    fun actionListeFragmentToTarifFragment(bilgi: String = "menudengeldim", id: Int = 0):
        NavDirections = ActionListeFragmentToTarifFragment(bilgi, id)
  }
}
