import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow


class MainScreen(): Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        Button(
            onClick = {
                navigator.push(SecondScreen())
            }
        ) {
            Text("Click")
        }
    }
}


class SecondScreen(): Screen {
    @Composable
    override fun Content() {
        Text("Hello World!")
    }
}


