package com.github.yanhua365.sample.trivia;

import com.github.yanhua365.sample.trivia.UrglyGame;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: yanhua
 * Date: 13-10-31
 * Time: 下午4:14
 * To change this template use File | Settings | File Templates.
 */
public class GameTest {

    UrglyGame game = null;

    @Before
    public void setUp() {
        game  = new UrglyGame();
    }


    @Test
    public void thatGameWithMoreThenTwoPlayersIsPlayable() {
        assertThat(game.howManyPlayers(), is(0));
        game.add("Tom");
        assertThat(game.howManyPlayers(), is(1));
        assertThat(game.isPlayable(), is(false));

        game.add("Jerry");
        assertThat(game.howManyPlayers(), is(2));
        assertThat(game.isPlayable(), is(true));

        game.add("Rose");
        assertThat(game.howManyPlayers(), is(3));
        assertThat(game.isPlayable(), is(true));
    }

}
