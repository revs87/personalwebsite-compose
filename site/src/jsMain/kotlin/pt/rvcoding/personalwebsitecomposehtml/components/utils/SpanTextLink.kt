package pt.rvcoding.personalwebsitecomposehtml.components.utils

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.WordBreak
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.wordBreak
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.dom.Span
import pt.rvcoding.personalwebsitecomposehtml.styles.MyLinkStyle


@Composable
fun SpanTextLink(
    modifier: Modifier = Modifier,
    text: String,
    breakpoint: Breakpoint
) {
    val list by remember { mutableStateOf(extractContentToList(text)) }

    Row(
        modifier = Modifier.wordBreak(WordBreak.KeepAll)
    ) {
        list.forEach { (text, link) ->
            if (link.isEmpty()) {
                SpanText(
                    text = text,
                    modifier = modifier
                        .textAlign(
                            if (breakpoint <= Breakpoint.SM) TextAlign.Justify
                            else TextAlign.Start
                        )
                )
            } else {
                Span {
                    Link(
                        path = link,
                        text = text,
                        modifier = MyLinkStyle
                            .toModifier()
                            .textAlign(
                                if (breakpoint <= Breakpoint.SM) TextAlign.Justify
                                else TextAlign.Start
                            ),
                        openInternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
                    )
                }
            }
        }
    }
}

private fun extractContentToList(input: String): List<Pair<String, String>> {
    val result = mutableListOf<Pair<String, String>>()
    val text2 = input.split("[[", "]]")
    text2.forEach { text ->
        if (text.contains("][")) {
            val parts = text.split("][")
            result.add(Pair(parts[0], parts[1]))
        } else if (text.isNotBlank()) {
            result.add(Pair(text, ""))
        }
    }
    return result
}