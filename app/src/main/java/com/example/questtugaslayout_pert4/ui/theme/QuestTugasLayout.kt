package com.example.questtugaslayout_pert4.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.questtugaslayout_pert4.R

@Composable
fun CardMahasiswa(
    nama: String,
    hp: String,
    alamat: String,
    warna: Color
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),

        colors = CardDefaults.cardColors(
            containerColor = warna
        )
    ) {

        Row(
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier.size(70.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = nama,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.white_custom)
                )

                Text(
                    text = hp,
                    color = colorResource(id = R.color.cyan_custom)
                )

                Text(
                    text = alamat,
                    color = colorResource(id = R.color.yellow_custom)
                )
            }

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier.size(70.dp)
            )
        }
    }
}

@Composable
fun ActivitasPertama(
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(70.dp))

            Text(
                text = stringResource(R.string.prodi),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = stringResource(R.string.univ),
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            CardMahasiswa(
                nama = stringResource(R.string.nama1),
                hp = stringResource(R.string.hp1),
                alamat = stringResource(R.string.alamat1),
                warna = colorResource(id = R.color.card_0_bg)
            )

            CardMahasiswa(
                nama = stringResource(R.string.nama2),
                hp = stringResource(R.string.hp2),
                alamat = stringResource(R.string.alamat2),
                warna = colorResource(id = R.color.card_1_bg)
            )

            CardMahasiswa(
                nama = stringResource(R.string.nama3),
                hp = stringResource(R.string.hp3),
                alamat = stringResource(R.string.alamat3),
                warna = colorResource(id = R.color.card_2_bg)
            )

            CardMahasiswa(
                nama = stringResource(R.string.nama4),
                hp = stringResource(R.string.hp4),
                alamat = stringResource(R.string.alamat4),
                warna = colorResource(id = R.color.card_3_bg)
            )
        }

        Text(
            text = stringResource(R.string.copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 20.dp)
        )
    }
}