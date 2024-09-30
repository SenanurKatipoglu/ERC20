package com.example.erc20token.base.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.erc20token.R

/**
 * Created by KATIPOGLU on 29.09.2024.
 */

@Composable
fun WalletWidget(
    balance: String? = null, // USD cinsinden
    walletList: List<String>? = null // mevcut cüzdan listesi
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            .height(160.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF001F3F),
                            Color(0x800000A0),
                            Color(0x6600A6D6)
                        )
                    )
                )
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 16.dp, top = 10.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_wallet),
                    contentDescription = "Wallet Icon",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(24.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "Main Wallet",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                )
            }

            Spacer(Modifier.height(12.dp))


            Row(
                modifier = Modifier
                    .padding(start = 16.dp, top = 10.dp)
            ) {

                Text(
                    text = "Balance: ",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                )
                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = balance.toString(),
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight. Normal,
                )

            }
        }
    }
}