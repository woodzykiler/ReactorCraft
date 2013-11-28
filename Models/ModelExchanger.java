/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2013
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 25/11/2013 10:48:28 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ReactorCraft.Models;

import java.util.List;

import net.minecraft.client.model.ModelRenderer;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelExchanger extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape1a;
	ModelRenderer Shape2a;
	ModelRenderer Shape2b;
	ModelRenderer Shape2c;
	ModelRenderer Shape1b;
	ModelRenderer Shape2d;
	ModelRenderer Shape1c;

	public ModelExchanger()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 0, 37);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 11F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 67, 19);
		Shape2.addBox(0F, 0F, 0F, 12, 2, 12);
		Shape2.setRotationPoint(-6F, 9F, -6F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape1a = new ModelRenderer(this, 0, 0);
		Shape1a.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1a.setRotationPoint(-8F, 8F, -8F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape2a = new ModelRenderer(this, 67, 19);
		Shape2a.addBox(0F, 0F, 0F, 12, 2, 12);
		Shape2a.setRotationPoint(-6F, 21F, -6F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new ModelRenderer(this, 0, 19);
		Shape2b.addBox(0F, 0F, 0F, 14, 2, 14);
		Shape2b.setRotationPoint(-7F, 18F, -7F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new ModelRenderer(this, 0, 57);
		Shape2c.addBox(0F, 0F, 0F, 16, 4, 16);
		Shape2c.setRotationPoint(-8F, 14F, -8F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape1b = new ModelRenderer(this, 0, 37);
		Shape1b.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1b.setRotationPoint(-8F, 20F, -8F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0F);
		Shape2d = new ModelRenderer(this, 0, 19);
		Shape2d.addBox(0F, 0F, 0F, 14, 2, 14);
		Shape2d.setRotationPoint(-7F, 12F, -7F);
		Shape2d.setTextureSize(128, 128);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0F, 0F, 0F);
		Shape1c = new ModelRenderer(this, 0, 0);
		Shape1c.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1c.setRotationPoint(-8F, 23F, -8F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(List li, float phi)
	{
		Shape1.render(f5);
		Shape2.render(f5);
		Shape1a.render(f5);
		Shape2a.render(f5);
		Shape2b.render(f5);
		Shape2c.render(f5);
		Shape1b.render(f5);
		Shape2d.render(f5);
		Shape1c.render(f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
