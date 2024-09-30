package com.example.erc20token.screen.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.erc20token.R
import com.example.erc20token.base.components.WalletWidget


/**
 * Created by KATIPOGLU on 30.07.2024.
 */

/**
 * stake etme ve cüzdan bilgileri burda, satma ve alma menulerine
 * burdan navigate edilecek
 */


@Composable
fun DashboardScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF121212))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            WalletWidget()

            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally // Text ve Icon aynı hizada olur
                ) {
                    IconButton(
                        onClick = {
                            // Buy your token
                        },
                        modifier = Modifier
                            .size(56.dp)
                            .background(Color(0xFF1E1E1E), shape = CircleShape)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_received),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        "Buy",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    )
                }

                Column(
                    horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally // Text ve Icon aynı hizada olur
                ) {
                    IconButton(
                        onClick = {
                            // Sell your token
                        },
                        modifier = Modifier
                            .size(56.dp)
                            .background(Color(0xFF1E1E1E), shape = CircleShape)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_send),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        "Sell",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    )
                }

                Column(
                    horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally // Text ve Icon aynı hizada olur
                ) {
                    IconButton(
                        onClick = {
                            // Transaction history
                        },
                        modifier = Modifier
                            .size(56.dp)
                            .background(Color(0xFF1E1E1E), shape = CircleShape)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_transaction),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        "History",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    )
                }

                Column(
                    horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally // Text ve Icon aynı hizada olur
                ) {
                    IconButton(
                        onClick = {
                            // navigate profile page
                        },
                        modifier = Modifier
                            .size(56.dp)
                            .background(Color(0xFF1E1E1E), shape = CircleShape)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_profile),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = Color.White
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        "Profile",
                        color = Color.White,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
            }

        }
    }
}