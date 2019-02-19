package com.sirniloc.yam.reli.pantheon;

import com.sirniloc.yam.reli.nbt.IPantheon;
import com.sirniloc.yam.reli.nbt.PantheonNBT;
import com.sirniloc.yam.reli.nbt.ReliNBT;
import com.sirniloc.yam.reli.pantheon.deities.DeityDiana;
import com.sirniloc.yam.reli.pantheon.deities.DeityKoren;
import com.sirniloc.yam.reli.pantheon.deities.DeityMaz;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.util.INBTSerializable;

public class Pantheon implements IPantheon,INBTSerializable<NBTTagCompound> {
	static int[] influence;
	static World world;
	
	public static final Alignment[] ALIGNMENTS = {
			new Alignment("Pure", 155, 255),
			new Alignment("Good", 55, 155),
			new Alignment("Neutral", -55, 55),
			new Alignment("Bad", -155, -55),
			new Alignment("Evil", -255, -155)
	};
	
	public static final Domain[] DOMAINS = {
			new Domain("Life", ALIGNMENTS[0]),
			new Domain("Change", ALIGNMENTS[1]),
			new Domain("War", ALIGNMENTS[2]),
			new Domain("Suffering", ALIGNMENTS[3]),
			new Domain("Death", ALIGNMENTS[4])
			};

	public static final Deity[] GODS = {
			new DeityDiana(), 
			new DeityMaz(),
			new DeityKoren()};

	public Pantheon(World o) {
		this.world=o;
	}

	@Override
	public void setInfluence(int[] intArray) {
		influence=intArray;
	}

	@Override
	public int[] getInfluence() {
		return influence;
	}

	@Override
	public NBTTagCompound serializeNBT() {
		return (NBTTagCompound) PantheonNBT.writeNBT(null, this, null);
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		PantheonNBT.readNBT(null, this, null, nbt);
	}
	
	
	
	
}
