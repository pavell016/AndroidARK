package com.example.act1.view

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
//import androidx.constraintlayout.widget.ConstraintLayout

@Composable
fun MyConstraintLayout(modifier: Modifier = Modifier){
    ConstraintLayout {
        val (boxRed, boxYellow, boxGreen, boxCyan, boxMagenta) = createRefs()

        Box(modifier = Modifier.size(120.dp).background(Color.Red).constrainAs(boxRed){
            centerTo(parent)
            /*
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            bottom.linkTo(parent.bottom)
            end.linkTo(parent.end)

             */
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Yellow).constrainAs(boxYellow){
            end.linkTo(boxRed.start)
            bottom.linkTo(boxRed.top)

        })
        Box(modifier = Modifier.size(120.dp).background(Color.Green).constrainAs(boxGreen){
            top.linkTo(boxRed.bottom)
            start.linkTo(boxRed.end)
            //start.linkTo(boxRed.start)
            //top.linkTo(boxRed.bottom)
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Cyan).constrainAs(boxCyan){
            top.linkTo(boxRed.bottom)
            end.linkTo(boxRed.start)
            //top.linkTo(boxRed.top)
            //end.linkTo(boxRed.start)
        })
        Box(modifier = Modifier.size(120.dp).background(Color.Magenta).constrainAs(boxMagenta){
            start.linkTo(boxRed.end)
            bottom.linkTo(boxRed.top)
            //top.linkTo(boxRed.top)
            //start.linkTo(boxRed.end)
        })

    }
}