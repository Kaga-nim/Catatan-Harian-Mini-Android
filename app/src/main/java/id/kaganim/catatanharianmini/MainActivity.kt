package id.kaganim.catatanharianmini

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatatanApp()
        }
    }
}

@Composable
fun CatatanApp() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            CatatanScreen()
        }
    }
}

@Composable
fun CatatanScreen() {

    var nama by remember { mutableStateOf("") }
    var pesan by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // IMAGE (logo)
        Image(
            painter = painterResource(id = R.drawable.gambar),
            contentDescription = "Logo",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // TEXT
        Text(
            text = "Catatan Harian Mini",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        // INPUT NAMA
        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it },
            label = { Text("Nama") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // INPUT PESAN
        OutlinedTextField(
            value = pesan,
            onValueChange = { pesan = it },
            label = { Text("Pesan") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // BUTTON
        Button(
            onClick = {
                hasil = "Halo, $nama!\nPesan kamu: $pesan"
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Simpan")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // HASIL
        Text(
            text = hasil,
            fontSize = 16.sp
        )
    }
}
