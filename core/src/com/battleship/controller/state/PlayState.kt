package com.battleship.controller.state

import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.battleship.controller.firebase.FirebaseController
import com.battleship.controller.firebase.UpdatePlayData
import com.battleship.model.Player
import com.battleship.view.PlayView
import com.battleship.view.View

class PlayState : State() {

    override var view: View = PlayView()

    override var firebaseController: FirebaseController = UpdatePlayData()
    // TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    var player: Player = Player()


    override fun create() {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun render(sb: SpriteBatch) {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        this.view.render(sb)
    }

    override fun update(dt: Float) {
       // TODO("not implemented") // To change body of created functions use File | Settings | File Templates.

    }

    override fun dispose() {
       // TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }
}
