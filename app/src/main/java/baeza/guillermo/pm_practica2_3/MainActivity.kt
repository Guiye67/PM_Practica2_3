package baeza.guillermo.pm_practica2_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import baeza.guillermo.pm_practica2_3.ui.theme.PM_Practica2_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PM_Practica2_3Theme() {
                Column() {
                    Text(
                        text = "Color principal del tema",
                        color = MaterialTheme.colors.primary,
                    )
                    Text(
                        text = "Variante del color principal",
                        color = MaterialTheme.colors.primaryVariant
                    )
                    Text(
                        text = "Color secundario",
                        color = MaterialTheme.colors.secondary
                    )
                }
            }
        }
    }
}