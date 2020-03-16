package com.battleship.model.ui

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector2
import com.battleship.controller.input.ButtonHandler
import com.battleship.model.GameObject

class GuiObject(
    val position: Vector2,
    val size: Vector2
) : GameObject() {
    constructor(posX: Float, posY: Float, sizeX: Float, sizeY: Float) : this(Vector2(posX, posY), Vector2(sizeX, sizeY))

    private val parts: MutableList<GuiElement> = mutableListOf()
    var listener: ButtonHandler = ButtonHandler(position, size) { }
    var isClickable: Boolean = false

    fun with(element: GuiElement): GuiObject {
        parts.forEachIndexed { index, guiElement ->
            if (guiElement.zIndex > element.zIndex) {
                parts.add(index, element)
                return this
            }
        }
        parts.add(element)
        return this
    }

    fun onClick(onClick: () -> Unit): GuiObject {
        listener = ButtonHandler(position, size, onClick)
        isClickable = true
        return this
    }

    override fun draw(batch: SpriteBatch) {
        parts.forEach {
            it.draw(batch, position, size)
        }
    }
}
