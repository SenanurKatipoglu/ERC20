package com.example.erc20token.base

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import com.example.erc20token.MainActivity

/**
 * Created by KATIPOGLU on 7.09.2024.
 */

@Composable
fun BaseScreen(
    baseViewModel: BaseViewModel? = null,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current

    baseViewModel?.let { viewModel ->
      val uiState by viewModel.baseState.collectAsState()

    }

}

/**
 * Bu reLaunch fonksiyonu, mevcut Android uygulamasındaki MainActivity'yi yeniden başlatmak için kullanılır.
 * Mevcut aktiviteyi kapatıp MainActivity'yi yeni bir görev (task) olarak başlatarak, uygulamanın belirli
 * bir durumunu sıfırlamak veya baştan başlatmak için kullanılır.
 */
fun reLaunch(context:Context){
    val intent = Intent(context, MainActivity::class.java)
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
    context.startActivity(intent)
    (context as Activity).finish()
}