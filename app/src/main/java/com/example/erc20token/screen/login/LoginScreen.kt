package com.example.erc20token.screen.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.erc20token.R
import com.example.erc20token.base.components.PrimaryButton
import com.example.erc20token.ui.theme.DarkBlue
import com.example.erc20token.ui.theme.PrimaryColor

/**
 * Created by KATIPOGLU on 30.07.2024.
 */

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .background(DarkBlue)
            .fillMaxSize()
            .padding(start = 16.dp)
    ) {
        Image(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .offset(y = 145.dp)
                .align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.ic_block),
            contentDescription = "blockchain"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Chain Wallet",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .offset(y = 170.dp)
                .padding(start = 16.dp, end = 16.dp)
                .align(Alignment.CenterHorizontally)
        )

        Text(
            text = "Connection to MetaMask",
            color = PrimaryColor,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .offset(y = 200.dp)
                .padding(start = 16.dp, end = 16.dp)
                .align(Alignment.CenterHorizontally)
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_metamask),
            contentDescription = "metamask",
            tint = Color.Unspecified,
            modifier = Modifier
                .size(50.dp)
                .align(Alignment.CenterHorizontally)
                .offset(y = 250.dp)
        )

        PrimaryButton(modifier = Modifier.fillMaxWidth()
            .padding(start = 34.dp, end = 34.dp)
            .offset(y = 270.dp), text = "Connect") {
             TODO( "MetaMask cüzdanını bağlama")
        }
    }
}