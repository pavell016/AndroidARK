import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.calcularpropina.viewModel.PropinaViewModel

var  pvm = PropinaViewModel()

@Composable
fun CalcularPropina(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,  // centra horizontalmente
        verticalArrangement = Arrangement.Center
    ) {

        Text("Calculador de Propines",
            style = MaterialTheme.typography.headlineSmall)

        TextField(value = pvm.state.precioMenu,
            onValueChange = {pvm.onPrecioChange(it)},
            label = {Text("Precio del Menú: ")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        Spacer(modifier = Modifier.height(16.dp))
        TextField(value = pvm.state.porcentajePropina,
            onValueChange = {pvm.onPorcentajeChange(it)},
            label = {Text("Porcentaje de propina: ")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { pvm.decrementarPropina() }) {
                Text("-")
            }
            Button(onClick = { pvm.incrementarPropina() }) {
                Text("+")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { pvm.calcularPropina() }) {
            Text("Calcular Propina")
        }
        Spacer(modifier = Modifier.height(20.dp))

        pvm.state.propina?.let {
            Text("Propina: $${"%.2f".format(it)}")
            Text("Total a pagar: $${"%.2f".format(pvm.state.totalConPropina)}")
        }
    }
}