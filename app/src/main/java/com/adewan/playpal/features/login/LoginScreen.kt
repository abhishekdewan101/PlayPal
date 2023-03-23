package com.adewan.playpal.features.login

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adewan.playpal.R
import com.adewan.playpal.core.ux.theme.AppTheme
import com.adewan.playpal.core.ux.utils.ChangeSystemUiEffect

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    ChangeSystemUiEffect(
        statusBarColor = MaterialTheme.colorScheme.background,
        navigationBarColor = MaterialTheme.colorScheme.background
    )
    Scaffold() { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            BoxWithConstraints(modifier = Modifier.padding(innerPadding)) {
                Image(
                    painter = painterResource(id = R.drawable.controller),
                    contentDescription = "",
                    modifier = Modifier.absoluteOffset(x = (-maxWidth / 2), y = (-maxHeight / 6)),
                    colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary)
                )
                Image(
                    painter = painterResource(id = R.drawable.controller),
                    contentDescription = "",
                    modifier = Modifier
                        .scale(scaleX = -1f, scaleY = 1f)
                        .absoluteOffset(x = (-maxWidth / 2), y = (-maxHeight / 6)),
                    colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.secondary)
                )
            }
            Text(
                text = "PlayPal",
                style = MaterialTheme.typography.displayLarge,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.padding(top = 100.dp))

            FilledTonalButton(
                onClick = {
                },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)
            ) {
                Row(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.g_logo),
                        contentDescription = "",
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Text(text = "Sign in with Google", style = MaterialTheme.typography.bodyLarge)
                }
            }
            Spacer(modifier = Modifier.padding(top = 30.dp))
            FilledTonalButton(onClick = {
            }, modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)) {
                Row(modifier = Modifier.padding(10.dp)) {
                    Icon(
                        Icons.Default.Logout,
                        contentDescription = "",
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Text(
                        text = "Continue without account",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewLoginScreen() {
    AppTheme {
        LoginScreen()
    }
}

@Preview
@Composable
fun PreviewLoginScreenLight() {
    AppTheme {
        LoginScreen()
    }
}
