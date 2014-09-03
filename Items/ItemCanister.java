/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ReactorCraft.Items;

import Reika.ReactorCraft.Base.ItemReactorTool;

public class ItemCanister extends ItemReactorTool {

	public ItemCanister(int tex) {
		super(tex);
		this.setContainerItem(this);
		hasSubtypes = true;
		this.setMaxDamage(0);
	}

}
