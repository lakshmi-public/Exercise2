import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.multifalvaoursample.ui.theme.MultiFalvaourSampleTheme


class Sample{
    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name! from malaysia")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MultiFalvaourSampleTheme {
            Greeting(" from malaysia")
        }
    }
}
