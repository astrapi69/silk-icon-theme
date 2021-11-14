package io.github.astrapi69;

import io.github.astrapi69.icon.ImageIconFactory;
import io.github.astrapi69.swing.button.IconButtonFactory;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class LoadIconTest
{

	@Test public void testloadIcons()
	{
		ImageIcon applicationAdd = ImageIconFactory.newImageIcon("io/github/astrapi69/silk/icons/application_add.png");
		JButton btnApplicationAdd = IconButtonFactory.newIconButton(applicationAdd, "New application");
		assertNotNull(btnApplicationAdd);
	}

}
