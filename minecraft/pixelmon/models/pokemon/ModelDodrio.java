package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelDodrio extends ModelBase
{
  //fields
    ModelRenderer LEFTLEGPIECE;
    ModelRenderer leftleg1;
    ModelRenderer leftleg2;
    ModelRenderer leftleg3;
    ModelRenderer leftleg4;
    ModelRenderer leftleg5;
    ModelRenderer RIGHTLEGPIECE;
    ModelRenderer rightleg1;
    ModelRenderer rightleg2;
    ModelRenderer rightleg3;
    ModelRenderer rightleg4;
    ModelRenderer rightleg5;
    ModelRenderer TAILPIECE;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer RIGHTHEADPIECE;
    ModelRenderer rhead1;
    ModelRenderer rhead2;
    ModelRenderer rhead3;
    ModelRenderer rhead4;
    ModelRenderer rhead5;
    ModelRenderer rhead6;
    ModelRenderer rhead7;
    ModelRenderer rhead8;
    ModelRenderer rhead9;
    ModelRenderer rhead10;
    ModelRenderer rhead11;
    ModelRenderer rhead12;
    ModelRenderer rhead13;
    ModelRenderer LEFTHEADPIECE;
    ModelRenderer lhead1;
    ModelRenderer lhead2;
    ModelRenderer lhead3;
    ModelRenderer lhead4;
    ModelRenderer lhead5;
    ModelRenderer lhead6;
    ModelRenderer lhead7;
    ModelRenderer lhead8;
    ModelRenderer lhead9;
    ModelRenderer lhead10;
    ModelRenderer MIDDLEHEADPIECE;
    ModelRenderer mhead1;
    ModelRenderer mhead2;
    ModelRenderer mhead3;
    ModelRenderer mhead4;
    ModelRenderer mhead5;
    ModelRenderer mhead6;
    ModelRenderer mhead7;
    ModelRenderer mhead8;
    ModelRenderer mhead9;
    ModelRenderer BODYPIECE;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;
    ModelRenderer body12;
    ModelRenderer body13;
    ModelRenderer body14;
    ModelRenderer neck1;
    ModelRenderer neck2;
    ModelRenderer neck3;
    ModelRenderer neck4;
    ModelRenderer neck5;
    ModelRenderer neck6;
  
  public ModelDodrio()
  {
    textureWidth = 128;
    textureHeight = 64;
    
    LEFTLEGPIECE = new ModelRenderer(this, "LEFTLEGPIECE");
    LEFTLEGPIECE.setRotationPoint(2F, 11F, 0.5F);
    setRotation(LEFTLEGPIECE, 0F, 0F, 0F);
    LEFTLEGPIECE.mirror = true;
      leftleg1 = new ModelRenderer(this, 124, 0);
      leftleg1.addBox(-0.2F, -0.5F, -0.7F, 1, 4, 1);
      leftleg1.setRotationPoint(0F, 0F, 0F);
      leftleg1.setTextureSize(128, 64);
      leftleg1.mirror = true;
      setRotation(leftleg1, 0.3490659F, 0F, 0F);
      leftleg2 = new ModelRenderer(this, 124, 0);
      leftleg2.addBox(-0.2F, 2.7F, 1.2F, 1, 9, 1);
      leftleg2.setRotationPoint(0F, 0F, 0F);
      leftleg2.setTextureSize(128, 64);
      leftleg2.mirror = true;
      setRotation(leftleg2, -0.2617994F, 0F, 0F);
      leftleg3 = new ModelRenderer(this, 113, 0);
      leftleg3.addBox(-0.2F, 11F, -5F, 1, 1, 6);
      leftleg3.setRotationPoint(0F, 0F, 0F);
      leftleg3.setTextureSize(128, 64);
      leftleg3.mirror = true;
      setRotation(leftleg3, 0F, 0F, 0F);
      leftleg4 = new ModelRenderer(this, 113, 0);
      leftleg4.addBox(-0.2F, 11F, -4.8F, 1, 1, 5);
      leftleg4.setRotationPoint(0F, 0F, 0F);
      leftleg4.setTextureSize(128, 64);
      leftleg4.mirror = true;
      setRotation(leftleg4, 0F, 0.3490659F, 0F);
      leftleg5 = new ModelRenderer(this, 113, 0);
      leftleg5.addBox(-0.2F, 11F, -5F, 1, 1, 5);
      leftleg5.setRotationPoint(0F, 0F, 0F);
      leftleg5.setTextureSize(128, 64);
      leftleg5.mirror = true;
      setRotation(leftleg5, 0F, -0.3490659F, 0F);
      
      LEFTLEGPIECE.addChild(leftleg1);
      LEFTLEGPIECE.addChild(leftleg2);
      LEFTLEGPIECE.addChild(leftleg3);
      LEFTLEGPIECE.addChild(leftleg4);
      LEFTLEGPIECE.addChild(leftleg5);
      
    RIGHTLEGPIECE = new ModelRenderer(this, "RIGHTLEGPIECE");
    RIGHTLEGPIECE.setRotationPoint(-2F, 11F, 0.5F);
    setRotation(RIGHTLEGPIECE, 0F, 0F, 0F);
    RIGHTLEGPIECE.mirror = true;
      rightleg1 = new ModelRenderer(this, 124, 0);
      rightleg1.addBox(-0.8F, -0.6F, -0.7F, 1, 4, 1);
      rightleg1.setRotationPoint(0F, 0F, 0F);
      rightleg1.setTextureSize(128, 64);
      rightleg1.mirror = true;
      setRotation(rightleg1, 0.3490659F, 0F, 0F);
      rightleg2 = new ModelRenderer(this, 124, 0);
      rightleg2.addBox(-0.8F, 2.6F, 1.2F, 1, 9, 1);
      rightleg2.setRotationPoint(0F, 0F, 0F);
      rightleg2.setTextureSize(128, 64);
      rightleg2.mirror = true;
      setRotation(rightleg2, -0.2617994F, 0F, 0F);
      rightleg3 = new ModelRenderer(this, 113, 0);
      rightleg3.addBox(-0.8F, 11F, -4.9F, 1, 1, 5);
      rightleg3.setRotationPoint(0F, 0F, 0F);
      rightleg3.setTextureSize(128, 64);
      rightleg3.mirror = true;
      setRotation(rightleg3, 0F, -0.3490659F, 0F);
      rightleg4 = new ModelRenderer(this, 113, 0);
      rightleg4.addBox(-0.8F, 11F, -5F, 1, 1, 6);
      rightleg4.setRotationPoint(0F, 0F, 0F);
      rightleg4.setTextureSize(128, 64);
      rightleg4.mirror = true;
      setRotation(rightleg4, 0F, 0F, 0F);
      rightleg5 = new ModelRenderer(this, 113, 0);
      rightleg5.addBox(-0.8F, 11F, -5.1F, 1, 1, 5);
      rightleg5.setRotationPoint(0F, 0F, 0F);
      rightleg5.setTextureSize(128, 64);
      rightleg5.mirror = true;
      setRotation(rightleg5, 0F, 0.3490659F, 0F);
      
      RIGHTLEGPIECE.addChild(rightleg1);
      RIGHTLEGPIECE.addChild(rightleg2);
      RIGHTLEGPIECE.addChild(rightleg3);
      RIGHTLEGPIECE.addChild(rightleg4);
      RIGHTLEGPIECE.addChild(rightleg5);
      
    TAILPIECE = new ModelRenderer(this, "TAILPIECE");
    TAILPIECE.setRotationPoint(0.5F, 6F, 5F);
    setRotation(TAILPIECE, 0F, 0F, 0F);
    TAILPIECE.mirror = true;
      tail1 = new ModelRenderer(this, 61, 50);
      tail1.addBox(-2F, -0.6F, -0.3F, 3, 0, 13);
      tail1.setRotationPoint(0F, 0F, 0F);
      tail1.setTextureSize(128, 64);
      tail1.mirror = true;
      setRotation(tail1, -0.2617994F, 0F, 0F);
      tail2 = new ModelRenderer(this, 62, 52);
      tail2.addBox(-2.2F, -0.3F, -0.3F, 4, 0, 11);
      tail2.setRotationPoint(0F, 0F, 0F);
      tail2.setTextureSize(128, 64);
      tail2.mirror = true;
      setRotation(tail2, -0.2617994F, 0.2617994F, 0F);
      tail3 = new ModelRenderer(this, 62, 52);
      tail3.addBox(-2.8F, -0.3F, 0F, 4, 0, 11);
      tail3.setRotationPoint(0F, 0F, 0F);
      tail3.setTextureSize(128, 64);
      tail3.mirror = true;
      setRotation(tail3, -0.2617994F, -0.2617994F, 0F);
      
      TAILPIECE.addChild(tail1);
      TAILPIECE.addChild(tail2);
      TAILPIECE.addChild(tail3);
      
    RIGHTHEADPIECE = new ModelRenderer(this, "RIGHTHEADPIECE");
    RIGHTHEADPIECE.setRotationPoint(-7F, -10F, -4F);
    setRotation(RIGHTHEADPIECE, 0F, 0F, 0F);
    RIGHTHEADPIECE.mirror = true;
      rhead1 = new ModelRenderer(this, 0, 0);
      rhead1.addBox(-3F, -5F, -2.5F, 5, 5, 5);
      rhead1.setRotationPoint(0F, 0F, 0F);
      rhead1.setTextureSize(128, 64);
      rhead1.mirror = true;
      setRotation(rhead1, 0F, 0.7853982F, 0F);
      rhead2 = new ModelRenderer(this, 108, 54);
      rhead2.addBox(-2.5F, -4.5F, -3F, 4, 4, 6);
      rhead2.setRotationPoint(0F, 0F, 0F);
      rhead2.setTextureSize(128, 64);
      rhead2.mirror = true;
      setRotation(rhead2, 0F, 0.7853982F, 0F);
      rhead3 = new ModelRenderer(this, 0, 0);
      rhead3.addBox(-3.5F, -4.5F, -2F, 6, 4, 4);
      rhead3.setRotationPoint(0F, 0F, 0F);
      rhead3.setTextureSize(128, 64);
      rhead3.mirror = true;
      setRotation(rhead3, 0F, 0.7853982F, 0F);
      rhead4 = new ModelRenderer(this, 0, 0);
      rhead4.addBox(-2.5F, -5.5F, -2F, 4, 6, 4);
      rhead4.setRotationPoint(0F, 0F, 0F);
      rhead4.setTextureSize(128, 64);
      rhead4.mirror = true;
      setRotation(rhead4, 0F, 0.7853982F, 0F);
      rhead5 = new ModelRenderer(this, 0, 0);
      rhead5.addBox(0.8F, -3.4F, -3.1F, 2, 1, 1);
      rhead5.setRotationPoint(0F, 0F, 0F);
      rhead5.setTextureSize(128, 64);
      rhead5.mirror = true;
      setRotation(rhead5, 0F, -0.5585054F, 0.7853982F);
      rhead6 = new ModelRenderer(this, 0, 0);
      rhead6.addBox(-3.8F, -2.8F, -3.1F, 2, 1, 1);
      rhead6.setRotationPoint(0F, 0F, 0F);
      rhead6.setTextureSize(128, 64);
      rhead6.mirror = true;
      setRotation(rhead6, 0F, 0.7853982F, 0.5585054F);
      rhead7 = new ModelRenderer(this, 116, 0);
      rhead7.addBox(0.4F, -2F, -7.7F, 1, 0, 5);
      rhead7.setRotationPoint(0F, 0F, 0F);
      rhead7.setTextureSize(128, 64);
      rhead7.mirror = true;
      setRotation(rhead7, 0F, 0.7853982F, -0.7853982F);
      rhead8 = new ModelRenderer(this, 116, 0);
      rhead8.addBox(-2F, -1.4F, -7.7F, 1, 0, 5);
      rhead8.setRotationPoint(0F, 0F, 0F);
      rhead8.setTextureSize(128, 64);
      rhead8.mirror = true;
      setRotation(rhead8, 0F, 0.7853982F, 0.7853982F);
      rhead9 = new ModelRenderer(this, 115, 0);
      rhead9.addBox(1.7F, -2.4F, -6.8F, 0, 1, 5);
      rhead9.setRotationPoint(0F, 0F, 0F);
      rhead9.setTextureSize(128, 64);
      rhead9.mirror = true;
      setRotation(rhead9, 0.6981317F, 1.396263F, 0.7853982F);
      rhead10 = new ModelRenderer(this, 115, 0);
      rhead10.addBox(1.7F, -1.4F, -6.8F, 1, 0, 5);
      rhead10.setRotationPoint(0F, 0F, 0F);
      rhead10.setTextureSize(128, 64);
      rhead10.mirror = true;
      setRotation(rhead10, 0.6981317F, 1.396263F, 0.7853982F);
      rhead11 = new ModelRenderer(this, 122, 0);
      rhead11.addBox(0.4F, -2F, -3.3F, 1, 1, 1);
      rhead11.setRotationPoint(0F, 0F, 0F);
      rhead11.setTextureSize(128, 64);
      rhead11.mirror = true;
      setRotation(rhead11, 0F, 0.7853982F, -0.7853982F);
      rhead12 = new ModelRenderer(this, 60, 0);
      rhead12.addBox(-1.5F, -9.3F, -3.9F, 1, 6, 0);
      rhead12.setRotationPoint(0F, 0F, 0F);
      rhead12.setTextureSize(128, 64);
      rhead12.mirror = true;
      setRotation(rhead12, -0.2617994F, 0.7853982F, 0.1745329F);
      rhead13 = new ModelRenderer(this, 60, 0);
      rhead13.addBox(-0.2F, -9.5F, -3.9F, 1, 6, 0);
      rhead13.setRotationPoint(0F, 0F, 0F);
      rhead13.setTextureSize(128, 64);
      rhead13.mirror = true;
      setRotation(rhead13, -0.2617994F, 0.7853982F, -0.1745329F);
      
      RIGHTHEADPIECE.addChild(rhead1);
      RIGHTHEADPIECE.addChild(rhead2);
      RIGHTHEADPIECE.addChild(rhead3);
      RIGHTHEADPIECE.addChild(rhead4);
      RIGHTHEADPIECE.addChild(rhead5);
      RIGHTHEADPIECE.addChild(rhead6);
      RIGHTHEADPIECE.addChild(rhead7);
      RIGHTHEADPIECE.addChild(rhead8);
      RIGHTHEADPIECE.addChild(rhead9);
      RIGHTHEADPIECE.addChild(rhead10);
      RIGHTHEADPIECE.addChild(rhead11);
      RIGHTHEADPIECE.addChild(rhead12);
      RIGHTHEADPIECE.addChild(rhead13);
      
    LEFTHEADPIECE = new ModelRenderer(this, "LEFTHEADPIECE");
    LEFTHEADPIECE.setRotationPoint(7F, -10F, -4F);
    setRotation(LEFTHEADPIECE, 0F, 0F, 0F);
    LEFTHEADPIECE.mirror = true;
      lhead1 = new ModelRenderer(this, 0, 0);
      lhead1.addBox(-2F, -5F, -3F, 5, 5, 5);
      lhead1.setRotationPoint(0F, 0F, 0F);
      lhead1.setTextureSize(128, 64);
      lhead1.mirror = true;
      setRotation(lhead1, 0F, -0.7853982F, 0F);
      lhead2 = new ModelRenderer(this, 0, 0);
      lhead2.addBox(-2.5F, -4.5F, -2.5F, 6, 4, 4);
      lhead2.setRotationPoint(0F, 0F, 0F);
      lhead2.setTextureSize(128, 64);
      lhead2.mirror = true;
      setRotation(lhead2, 0F, -0.7853982F, 0F);
      lhead3 = new ModelRenderer(this, 0, 0);
      lhead3.addBox(-1.5F, -5.5F, -2.5F, 4, 6, 4);
      lhead3.setRotationPoint(0F, 0F, 0F);
      lhead3.setTextureSize(128, 64);
      lhead3.mirror = true;
      setRotation(lhead3, 0F, -0.7853982F, 0F);
      lhead4 = new ModelRenderer(this, 108, 44);
      lhead4.addBox(-1.5F, -4.5F, -3.5F, 4, 4, 6);
      lhead4.setRotationPoint(0F, 0F, 0F);
      lhead4.setTextureSize(128, 64);
      lhead4.mirror = true;
      setRotation(lhead4, 0F, -0.7853982F, 0F);
      lhead5 = new ModelRenderer(this, 0, 0);
      lhead5.addBox(1.9F, -3.5F, -2.1F, 1, 1, 1);
      lhead5.setRotationPoint(0F, 0F, 0F);
      lhead5.setTextureSize(128, 64);
      lhead5.mirror = true;
      setRotation(lhead5, 0F, 0F, 0F);
      lhead6 = new ModelRenderer(this, 0, 0);
      lhead6.addBox(2.6F, -4.2F, -0.9F, 1, 1, 2);
      lhead6.setRotationPoint(0F, 0F, 0F);
      lhead6.setTextureSize(128, 64);
      lhead6.mirror = true;
      setRotation(lhead6, 0.1745329F, 0.7853982F, 0F);
      lhead7 = new ModelRenderer(this, 0, 0);
      lhead7.addBox(2.6F, -4.4F, -0.1F, 1, 1, 2);
      lhead7.setRotationPoint(0F, 0F, 0F);
      lhead7.setTextureSize(128, 64);
      lhead7.mirror = true;
      setRotation(lhead7, -0.1745329F, 0.7853982F, 0F);
      lhead8 = new ModelRenderer(this, 114, 0);
      lhead8.addBox(-1.4F, -1.9F, -6.8F, 1, 1, 5);
      lhead8.setRotationPoint(0F, 0F, 0F);
      lhead8.setTextureSize(128, 64);
      lhead8.mirror = true;
      setRotation(lhead8, 0F, -0.7853982F, 0.7853982F);
      lhead9 = new ModelRenderer(this, 60, 0);
      lhead9.addBox(-0.7F, -9.1F, -4F, 1, 6, 0);
      lhead9.setRotationPoint(0F, 0F, 0F);
      lhead9.setTextureSize(128, 64);
      lhead9.mirror = true;
      setRotation(lhead9, -0.2617994F, -0.7853982F, 0.1745329F);
      lhead10 = new ModelRenderer(this, 60, 0);
      lhead10.addBox(0.4F, -9F, -4F, 1, 6, 0);
      lhead10.setRotationPoint(0F, 0F, 0F);
      lhead10.setTextureSize(128, 64);
      lhead10.mirror = true;
      setRotation(lhead10, -0.2617994F, -0.7853982F, -0.1745329F);
      
      LEFTHEADPIECE.addChild(lhead1);
      LEFTHEADPIECE.addChild(lhead2);
      LEFTHEADPIECE.addChild(lhead3);
      LEFTHEADPIECE.addChild(lhead4);
      LEFTHEADPIECE.addChild(lhead5);
      LEFTHEADPIECE.addChild(lhead6);
      LEFTHEADPIECE.addChild(lhead7);
      LEFTHEADPIECE.addChild(lhead8);
      LEFTHEADPIECE.addChild(lhead9);
      LEFTHEADPIECE.addChild(lhead10);
      
    MIDDLEHEADPIECE = new ModelRenderer(this, "MIDDLEHEADPIECE");
    MIDDLEHEADPIECE.setRotationPoint(0F, -10F, -5F);
    setRotation(MIDDLEHEADPIECE, 0F, 0F, 0F);
    MIDDLEHEADPIECE.mirror = true;
      mhead1 = new ModelRenderer(this, 0, 0);
      mhead1.addBox(-2.5F, -5F, -3F, 5, 5, 5);
      mhead1.setRotationPoint(0F, 0F, 0F);
      mhead1.setTextureSize(128, 64);
      mhead1.mirror = true;
      setRotation(mhead1, 0F, 0F, 0F);
      mhead2 = new ModelRenderer(this, 0, 0);
      mhead2.addBox(-3F, -4.5F, -2.5F, 6, 4, 4);
      mhead2.setRotationPoint(0F, 0F, 0F);
      mhead2.setTextureSize(128, 64);
      mhead2.mirror = true;
      setRotation(mhead2, 0F, 0F, 0F);
      mhead3 = new ModelRenderer(this, 0, 0);
      mhead3.addBox(-2F, -5.5F, -2.5F, 4, 6, 4);
      mhead3.setRotationPoint(0F, 0F, 0F);
      mhead3.setTextureSize(128, 64);
      mhead3.mirror = true;
      setRotation(mhead3, 0F, 0F, 0F);
      mhead4 = new ModelRenderer(this, 108, 54);
      mhead4.addBox(-2F, -4.5F, -3.5F, 4, 4, 6);
      mhead4.setRotationPoint(0F, 0F, 0F);
      mhead4.setTextureSize(128, 64);
      mhead4.mirror = true;
      setRotation(mhead4, 0F, 0F, 0F);
      mhead5 = new ModelRenderer(this, 0, 0);
      mhead5.addBox(1.3F, -3.1F, -3.6F, 2, 1, 1);
      mhead5.setRotationPoint(0F, 0F, 0F);
      mhead5.setTextureSize(128, 64);
      mhead5.mirror = true;
      setRotation(mhead5, 0F, 0F, -0.5585054F);
      mhead6 = new ModelRenderer(this, 0, 0);
      mhead6.addBox(-3.3F, -3.1F, -3.6F, 2, 1, 1);
      mhead6.setRotationPoint(0F, 0F, 0F);
      mhead6.setTextureSize(128, 64);
      mhead6.mirror = true;
      setRotation(mhead6, 0F, 0F, 0.5585054F);
      mhead7 = new ModelRenderer(this, 113, 0);
      mhead7.addBox(-1.8F, -1.8F, -8F, 1, 1, 5);
      mhead7.setRotationPoint(0F, 0F, 0F);
      mhead7.setTextureSize(128, 64);
      mhead7.mirror = true;
      setRotation(mhead7, 0F, 0F, 0.7853982F);
      mhead8 = new ModelRenderer(this, 60, 0);
      mhead8.addBox(-1.5F, -8.2F, -5F, 1, 6, 0);
      mhead8.setRotationPoint(0F, 0F, 0F);
      mhead8.setTextureSize(128, 64);
      mhead8.mirror = true;
      setRotation(mhead8, -0.5235988F, -0.2617994F, 0F);
      mhead9 = new ModelRenderer(this, 60, 0);
      mhead9.addBox(0.5F, -8.2F, -5F, 1, 6, 0);
      mhead9.setRotationPoint(0F, 0F, 0F);
      mhead9.setTextureSize(128, 64);
      mhead9.mirror = true;
      setRotation(mhead9, -0.5235988F, 0.2617994F, 0F);
      
      MIDDLEHEADPIECE.addChild(mhead1);
      MIDDLEHEADPIECE.addChild(mhead2);
      MIDDLEHEADPIECE.addChild(mhead3);
      MIDDLEHEADPIECE.addChild(mhead4);
      MIDDLEHEADPIECE.addChild(mhead5);
      MIDDLEHEADPIECE.addChild(mhead6);
      MIDDLEHEADPIECE.addChild(mhead7);
      MIDDLEHEADPIECE.addChild(mhead8);
      MIDDLEHEADPIECE.addChild(mhead9);
      
    BODYPIECE = new ModelRenderer(this, "BODYPIECE");
    BODYPIECE.setRotationPoint(1F, 3F, 1F);
    setRotation(BODYPIECE, 0F, 0F, 0F);
    BODYPIECE.mirror = true;
      body1 = new ModelRenderer(this, 50, 20);
      body1.addBox(-5.5F, -3.5F, -5.5F, 9, 9, 9);
      body1.setRotationPoint(0F, 0F, 0F);
      body1.setTextureSize(128, 64);
      body1.mirror = true;
      setRotation(body1, 0F, 0F, 0F);
      body2 = new ModelRenderer(this, 18, 20);
      body2.addBox(-5F, -4F, -5F, 8, 10, 8);
      body2.setRotationPoint(0F, 0F, 0F);
      body2.setTextureSize(128, 64);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, 0F);
      body3 = new ModelRenderer(this, 92, 24);
      body3.addBox(-5F, -3F, -6F, 8, 8, 10);
      body3.setRotationPoint(0F, 0F, 0F);
      body3.setTextureSize(128, 64);
      body3.mirror = true;
      setRotation(body3, 0F, 0F, 0F);
      body4 = new ModelRenderer(this, 0, 0);
      body4.addBox(-6F, -3F, -5F, 10, 8, 8);
      body4.setRotationPoint(0F, 0F, 0F);
      body4.setTextureSize(128, 64);
      body4.mirror = true;
      setRotation(body4, 0F, 0F, 0F);
      body5 = new ModelRenderer(this, 0, 57);
      body5.addBox(-4.5F, 6F, -3.5F, 3, 2, 5);
      body5.setRotationPoint(0F, 0F, 0F);
      body5.setTextureSize(128, 64);
      body5.mirror = true;
      setRotation(body5, 0F, 0F, 0F);
      body7 = new ModelRenderer(this, 0, 57);
      body7.addBox(-0.5F, 6F, -3.5F, 3, 2, 5);
      body7.setRotationPoint(0F, 0F, 0F);
      body7.setTextureSize(128, 64);
      body7.mirror = true;
      setRotation(body7, 0F, 0F, 0F);
      body8 = new ModelRenderer(this, 0, 57);
      body8.addBox(-7F, 2.6F, -3.5F, 3, 2, 5);
      body8.setRotationPoint(0F, 0F, 0F);
      body8.setTextureSize(128, 64);
      body8.mirror = true;
      setRotation(body8, 0F, 0F, -1.308997F);
      body9 = new ModelRenderer(this, 0, 57);
      body9.addBox(3.5F, 4.5F, -3.5F, 3, 2, 5);
      body9.setRotationPoint(0F, 0F, 0F);
      body9.setTextureSize(128, 64);
      body9.mirror = true;
      setRotation(body9, 0F, 0F, 1.308997F);
      body10 = new ModelRenderer(this, 3, 57);
      body10.addBox(-1.5F, 5.9F, -3.5F, 1, 2, 5);
      body10.setRotationPoint(0F, 0F, 0F);
      body10.setTextureSize(128, 64);
      body10.mirror = true;
      setRotation(body10, 0F, 0F, -0.122173F);
      body11 = new ModelRenderer(this, 0, 57);
      body11.addBox(-1.5F, 6.1F, -4.5F, 1, 2, 5);
      body11.setRotationPoint(0F, 0F, 0F);
      body11.setTextureSize(128, 64);
      body11.mirror = true;
      setRotation(body11, 0F, 0F, 0.122173F);
      body12 = new ModelRenderer(this, 62, 0);
      body12.addBox(-4F, -2F, -6.5F, 6, 6, 11);
      body12.setRotationPoint(0F, 0F, 0F);
      body12.setTextureSize(128, 64);
      body12.mirror = true;
      setRotation(body12, 0F, 0F, 0F);
      body13 = new ModelRenderer(this, 0, 32);
      body13.addBox(-4F, -4.5F, -4F, 6, 11, 6);
      body13.setRotationPoint(0F, 0F, 0F);
      body13.setTextureSize(128, 64);
      body13.mirror = true;
      setRotation(body13, 0F, 0F, 0F);
      body14 = new ModelRenderer(this, 0, 0);
      body14.addBox(-6.5F, -2F, -4F, 11, 6, 6);
      body14.setRotationPoint(0F, 0F, 0F);
      body14.setTextureSize(128, 64);
      body14.mirror = true;
      setRotation(body14, 0F, 0F, 0F);
      neck1 = new ModelRenderer(this, 113, 0);
      neck1.addBox(-1.3F, -9.4F, -5.1F, 1, 5, 1);
      neck1.setRotationPoint(0F, 0F, 0F);
      neck1.setTextureSize(128, 64);
      neck1.mirror = true;
      setRotation(neck1, 0F, 0F, -0.6981317F);
      neck2 = new ModelRenderer(this, 124, 0);
      neck2.addBox(-5.8F, -14.5F, -5.1F, 1, 7, 1);
      neck2.setRotationPoint(0F, 0F, 0F);
      neck2.setTextureSize(128, 64);
      neck2.mirror = true;
      setRotation(neck2, 0F, 0F, -0.1745329F);
      neck3 = new ModelRenderer(this, 124, 0);
      neck3.addBox(2.9F, -14.1F, -5.1F, 1, 7, 1);
      neck3.setRotationPoint(0F, 0F, 0F);
      neck3.setTextureSize(128, 64);
      neck3.mirror = true;
      setRotation(neck3, 0F, 0F, 0.1745329F);
      neck4 = new ModelRenderer(this, 113, 0);
      neck4.addBox(-1.2F, -8.1F, -5.1F, 1, 5, 1);
      neck4.setRotationPoint(0F, 0F, 0F);
      neck4.setTextureSize(128, 64);
      neck4.mirror = true;
      setRotation(neck4, 0F, 0F, 0.6981317F);
      neck5 = new ModelRenderer(this, 113, 0);
      neck5.addBox(-1.5F, -8.6F, -3.9F, 1, 4, 1);
      neck5.setRotationPoint(0F, 0F, 0F);
      neck5.setTextureSize(128, 64);
      neck5.mirror = true;
      setRotation(neck5, 0.3490659F, 0F, 0F);
      neck6 = new ModelRenderer(this, 124, 0);
      neck6.addBox(-1.5F, -12.7F, -6.6F, 1, 6, 1);
      neck6.setRotationPoint(0F, 0F, 0F);
      neck6.setTextureSize(128, 64);
      neck6.mirror = true;
      setRotation(neck6, 0F, 0F, 0F);
      
      BODYPIECE.addChild(body1);
      BODYPIECE.addChild(body2);
      BODYPIECE.addChild(body3);
      BODYPIECE.addChild(body4);
      BODYPIECE.addChild(body5);
      BODYPIECE.addChild(body7);
      BODYPIECE.addChild(body8);
      BODYPIECE.addChild(body9);
      BODYPIECE.addChild(body10);
      BODYPIECE.addChild(body11);
      BODYPIECE.addChild(body12);
      BODYPIECE.addChild(body13);
      BODYPIECE.addChild(body14);
      BODYPIECE.addChild(neck1);
      BODYPIECE.addChild(neck2);
      BODYPIECE.addChild(neck3);
      BODYPIECE.addChild(neck4);
      BODYPIECE.addChild(neck5);
      BODYPIECE.addChild(neck6);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    LEFTLEGPIECE.render(f5);
    RIGHTLEGPIECE.render(f5);
    TAILPIECE.render(f5);
    RIGHTHEADPIECE.render(f5);
    LEFTHEADPIECE.render(f5);
    MIDDLEHEADPIECE.render(f5);
    BODYPIECE.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
