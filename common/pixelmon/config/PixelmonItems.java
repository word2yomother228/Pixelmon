package pixelmon.config;

import java.lang.reflect.Field;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;

import net.minecraftforge.common.Configuration;
import pixelmon.entities.pokeballs.EntityPokeBall;
import pixelmon.enums.EnumApricorns;
import pixelmon.enums.EnumEthers;
import pixelmon.enums.EnumEvolutionStone;
import pixelmon.enums.EnumHeldItems;
import pixelmon.enums.EnumPokeballs;
import pixelmon.enums.EnumPotions;
import pixelmon.enums.EnumStatusAilmentHealers;
import pixelmon.items.ItemApricorn;
import pixelmon.items.ItemApricornCooked;
import pixelmon.items.ItemBlock;
import pixelmon.items.ItemEther;
import pixelmon.items.ItemEvolutionStone;
import pixelmon.items.ItemHammer;
import pixelmon.items.ItemHeld;
import pixelmon.items.ItemPokeBall;
import pixelmon.items.ItemPokedex;
import pixelmon.items.ItemPotion;
import pixelmon.items.ItemStatusAilmentHealer;
import pixelmon.items.PixelmonItem;
import pixelmon.items.heldItems.ItemBerryLeppa;
import pixelmon.items.heldItems.ItemBerryOran;
import pixelmon.items.heldItems.ItemBerryRawst;
import pixelmon.items.heldItems.ItemExpShare;
import pixelmon.items.heldItems.ItemLuckyEgg;

public class PixelmonItems {
	public static int pokeCheckerID;
	public static int pokeDexID;

	public static int rareCandyID;
	public static int potionID;
	public static int superPotionID;
	public static int hyperPotionID;
	public static int maxPotionID;
	public static int etherID;
	public static int maxEtherID;
	public static int elixirID;
	public static int maxElixirID;
	public static int fullRestoreID;
	public static int antidoteID;
	public static int parlyzHealID;
	public static int awakeningID;
	public static int burnHealID;
	public static int iceHealID;
	public static int fullHealID;

	public static int pcItemID;
	public static int healerItemID;
	public static int anvilItemID;

	public static int fireStoneID;
	public static int waterStoneID;
	public static int moonStoneID;
	public static int thunderStoneID;
	public static int leafStoneID;
	public static int thunderStoneShardID;
	public static int leafStoneShardID;
	public static int waterStoneShardID;
	public static int fireStoneShardID;

	public static int luckyEggID;
	public static int expShareID;

	public static int berryOranID;
	public static int berryRawstID;
	public static int berryLeppaID;

	public static int hammerWoodID;
	public static int hammerStoneID;
	public static int hammerIronID;
	public static int hammerGoldID;
	public static int hammerDiamondID;

	@Mod.Item(name = "PokeChecker", typeClass = "pixelmon.items.PixelmonItem")
	public static Item pokeChecker;
	@Mod.Item(name = "Pokedex", typeClass = "pixelmon.items.ItemPokedex")
	public static Item pokeDex;

	@Mod.Item(name = "Rare Candy", typeClass = "pixelmon.items.PixelmonItem")
	public static Item rareCandy;

	@Mod.Item(name = "Potion", typeClass = "pixelmon.items.ItemPotion")
	public static Item potion;
	@Mod.Item(name = "Super Potion", typeClass = "pixelmon.items.ItemPotion")
	public static Item superPotion;
	@Mod.Item(name = "Hyper Potion", typeClass = "pixelmon.items.ItemPotion")
	public static Item hyperPotion;
	@Mod.Item(name = "Max Potion", typeClass = "pixelmon.items.ItemPotion")
	public static Item maxPotion;
	@Mod.Item(name = "Ether", typeClass = "pixelmon.items.ItemEther")
	public static Item ether;
	@Mod.Item(name = "Max Ether", typeClass = "pixelmon.items.ItemEther")
	public static Item maxEther;
	@Mod.Item(name = "Elixir", typeClass = "pixelmon.items.ItemEther")
	public static Item elixir;
	@Mod.Item(name = "Max Elixir", typeClass = "pixelmon.items.ItemEther")
	public static Item maxElixir;
	@Mod.Item(name = "Full Restore", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item fullRestore;
	@Mod.Item(name = "Antidote", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item antidote;
	@Mod.Item(name = "Parlyz Heal", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item parlyzHeal;
	@Mod.Item(name = "Awakening", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item awakening;
	@Mod.Item(name = "Burn Heal", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item burnHeal;
	@Mod.Item(name = "Ice Heal", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item iceHeal;
	@Mod.Item(name = "Full Heal", typeClass = "pixelmon.items.ItemStatusAilmentHealer")
	public static Item fullHeal;

	@Mod.Item(name = "Fire Stone", typeClass = "pixelmon.items.ItemEvolutionStone")
	public static Item fireStone;
	@Mod.Item(name = "Water Stone", typeClass = "pixelmon.items.ItemEvolutionStone")
	public static Item waterStone;
	@Mod.Item(name = "Moon Stone", typeClass = "pixelmon.items.ItemEvolutionStone")
	public static Item moonStone;
	@Mod.Item(name = "Thunder Stone", typeClass = "pixelmon.items.ItemEvolutionStone")
	public static Item thunderStone;
	@Mod.Item(name = "Leaf Stone", typeClass = "pixelmon.items.ItemEvolutionStone")
	public static Item leafStone;

	@Mod.Item(name = "PC", typeClass = "pixelmon.items.ItemBlock")
	public static Item pcItem;
	@Mod.Item(name = "Healer", typeClass = "pixelmon.items.ItemBlock")
	public static Item healerItem;
	@Mod.Item(name = "Anvil", typeClass = "pixelmon.items.ItemBlock")
	public static Item anvilItem;

	@Mod.Item(name = "Thunder Stone Shard", typeClass = "pixelmon.items.PixelmonItem")
	public static Item thunderStoneShard;
	@Mod.Item(name = "Leaf Stone Shard", typeClass = "pixelmon.items.PixelmonItem")
	public static Item leafStoneShard;
	@Mod.Item(name = "Water Stone Shard", typeClass = "pixelmon.items.PixelmonItem")
	public static Item waterStoneShard;
	@Mod.Item(name = "Fire Stone Shard", typeClass = "pixelmon.items.PixelmonItem")
	public static Item fireStoneShard;

	@Mod.Item(name = "Lucky Egg", typeClass = "pixelmon.items.heldItems.ItemLuckyEgg")
	public static Item luckyEgg;
	@Mod.Item(name = "EXP Share", typeClass = "pixelmon.items.heldItems.ItemExpShare")
	public static Item expShare;

	@Mod.Item(name = "Oran Berry", typeClass = "pixelmon.items.heldItems.ItemBerryOran")
	public static Item berryOran;
	@Mod.Item(name = "Rawst Berry", typeClass = "pixelmon.items.heldItems.ItemBerryRawst")
	public static Item berryRawst;
	@Mod.Item(name = "Leppa Berry", typeClass = "pixelmon.items.heldItems.ItemBerryLeppa")
	public static Item berryLeppa;

	@Mod.Item(name = "Wood Hammer", typeClass = "pixelmon.items.ItemHammer")
	public static Item hammerWood;
	@Mod.Item(name = "Stone Hammer", typeClass = "pixelmon.items.ItemTool")
	public static Item hammerStone;
	@Mod.Item(name = "Iron Hammer", typeClass = "pixelmon.items.ItemTool")
	public static Item hammerIron;
	@Mod.Item(name = "Gold Hammer", typeClass = "pixelmon.items.ItemTool")
	public static Item hammerGold;
	@Mod.Item(name = "Diamond Hammer", typeClass = "pixelmon.items.ItemTool")
	public static Item hammerDiamond;

	public static void load(Configuration cfg) {
		PixelmonItemsPokeballs.load(cfg);
		PixelmonItemsApricorns.load(cfg);

		pokeCheckerID = cfg.getOrCreateIntProperty("PokeChecker", "item", 10004).getInt();
		pokeDexID = cfg.getOrCreateIntProperty("PokeDex", "item", 10027).getInt();
		rareCandyID = cfg.getOrCreateIntProperty("RareCandy", "item", 10005).getInt();
		potionID = cfg.getOrCreateIntProperty("Potion", "item", 10006).getInt();
		superPotionID = cfg.getOrCreateIntProperty("SuperPotion", "item", 10050).getInt();
		hyperPotionID = cfg.getOrCreateIntProperty("HyperPotion", "item", 10051).getInt();
		maxPotionID = cfg.getOrCreateIntProperty("MaxPotion", "item", 10052).getInt();
		etherID = cfg.getOrCreateIntProperty("Ether", "item", 10053).getInt();
		maxEtherID = cfg.getOrCreateIntProperty("MaxEther", "item", 10054).getInt();
		elixirID = cfg.getOrCreateIntProperty("Elixir", "item", 10055).getInt();
		maxElixirID = cfg.getOrCreateIntProperty("MaxElixir", "item", 10056).getInt();
		fullRestoreID = cfg.getOrCreateIntProperty("FullRestore", "item", 10057).getInt();
		antidoteID = cfg.getOrCreateIntProperty("Antidote", "item", 10058).getInt();
		parlyzHealID = cfg.getOrCreateIntProperty("ParlyzHeal", "item", 10059).getInt();
		awakeningID = cfg.getOrCreateIntProperty("Awakening", "item", 10060).getInt();
		burnHealID = cfg.getOrCreateIntProperty("BurnHeal", "item", 10061).getInt();
		iceHealID = cfg.getOrCreateIntProperty("IceHeal", "item", 10062).getInt();
		fullHealID = cfg.getOrCreateIntProperty("FullHeal", "item", 10063).getInt();
		fireStoneID = cfg.getOrCreateIntProperty("FireStone", "item", 10008).getInt();
		waterStoneID = cfg.getOrCreateIntProperty("WaterStone", "item", 10009).getInt();
		moonStoneID = cfg.getOrCreateIntProperty("MoonStone", "item", 10010).getInt();
		thunderStoneID = cfg.getOrCreateIntProperty("ThunderStone", "item", 10011).getInt();
		leafStoneID = cfg.getOrCreateIntProperty("LeafStone", "item", 10012).getInt();
		pcItemID = cfg.getOrCreateIntProperty("PCItem", "item", 10013).getInt();
		healerItemID = cfg.getOrCreateIntProperty("HealerItem", "item", 10014).getInt();
		anvilItemID = cfg.getOrCreateIntProperty("AnvilItem", "item", 10015).getInt();
		thunderStoneShardID = cfg.getOrCreateIntProperty("ThunderStoneShard", "item", 10021).getInt();
		leafStoneShardID = cfg.getOrCreateIntProperty("LeafStoneShard", "item", 10022).getInt();
		waterStoneShardID = cfg.getOrCreateIntProperty("WaterStoneShard", "item", 10023).getInt();
		fireStoneShardID = cfg.getOrCreateIntProperty("FireStoneShard", "item", 10024).getInt();
		luckyEggID = cfg.getOrCreateIntProperty("LuckyEgg", "item", 10035).getInt();
		expShareID = cfg.getOrCreateIntProperty("EXPShare", "item", 10036).getInt();
		berryOranID = cfg.getOrCreateIntProperty("OranBerry", "item", 10040).getInt();
		berryRawstID = cfg.getOrCreateIntProperty("RawstBerry", "item", 10041).getInt();
		berryLeppaID = cfg.getOrCreateIntProperty("LeppaBerry", "item", 10042).getInt();

		hammerWoodID = cfg.getOrCreateIntProperty("Wood Hammer", "item", 10107).getInt();
		hammerStoneID = cfg.getOrCreateIntProperty("Stone Hammer", "item", 10108).getInt();
		hammerIronID = cfg.getOrCreateIntProperty("Iron Hammer", "item", 10109).getInt();
		hammerGoldID = cfg.getOrCreateIntProperty("Gold Hammer", "item", 10110).getInt();
		hammerDiamondID = cfg.getOrCreateIntProperty("Diamond Hammer", "item", 10111).getInt();

		pokeChecker = new PixelmonItem(pokeCheckerID).setItemName("PokeChecker").setIconIndex(2).setMaxStackSize(1).setTabToDisplayOn(CreativeTabs.tabTools);
		pokeDex = new ItemPokedex(pokeDexID).setItemName("Pokedex").setIconIndex(18).setMaxStackSize(1);
		rareCandy = new PixelmonItem(rareCandyID).setItemName("Rare Candy").setIconIndex(6);
		potion = new ItemPotion(potionID, EnumPotions.Potion).setItemName("Potion");
		superPotion = new ItemPotion(superPotionID, EnumPotions.SuperPotion).setItemName("Super Potion");
		hyperPotion = new ItemPotion(hyperPotionID, EnumPotions.HyperPotion).setItemName("Hyper Potion");
		maxPotion = new ItemPotion(maxPotionID, EnumPotions.MaxPotion).setItemName("Max Potion");
		ether = new ItemEther(etherID, EnumEthers.Ether).setItemName("Ether");
		maxEther = new ItemEther(maxEtherID, EnumEthers.MaxEther).setItemName("Max Ether");
		elixir = new ItemEther(elixirID, EnumEthers.Elixir).setItemName("Elixir");
		maxElixir = new ItemEther(maxElixirID, EnumEthers.MaxElixir).setItemName("Max Elixir");
		fullRestore = new ItemStatusAilmentHealer(fullRestoreID, EnumStatusAilmentHealers.FullRestore).setItemName("Full Restore");
		antidote = new ItemStatusAilmentHealer(antidoteID, EnumStatusAilmentHealers.Antidote).setItemName("Antidonte");
		parlyzHeal = new ItemStatusAilmentHealer(parlyzHealID, EnumStatusAilmentHealers.ParlyzHeal).setItemName("Parlyz Heal");
		awakening = new ItemStatusAilmentHealer(awakeningID, EnumStatusAilmentHealers.Awakening).setItemName("Awakening");
		burnHeal = new ItemStatusAilmentHealer(burnHealID, EnumStatusAilmentHealers.BurnHeal).setItemName("Burn Heal");
		iceHeal = new ItemStatusAilmentHealer(iceHealID, EnumStatusAilmentHealers.IceHeal).setItemName("Ice Heal");
		fullHeal = new ItemStatusAilmentHealer(fullHealID, EnumStatusAilmentHealers.FullHeal).setItemName("Full Heal");
		fireStone = new ItemEvolutionStone(fireStoneID, EnumEvolutionStone.Firestone, 3).setItemName("FireStone");
		waterStone = new ItemEvolutionStone(waterStoneID, EnumEvolutionStone.Waterstone, 1).setItemName("WaterStone");
		moonStone = new ItemEvolutionStone(moonStoneID, EnumEvolutionStone.Moonstone, 4).setItemName("MoonStone");
		thunderStone = new ItemEvolutionStone(thunderStoneID, EnumEvolutionStone.Thunderstone, 0).setItemName("ThunderStone");
		leafStone = new ItemEvolutionStone(leafStoneID, EnumEvolutionStone.Leafstone, 2).setItemName("LeafStone");
		pcItem = new ItemBlock(pcItemID, PixelmonBlocks.pc, 34).setItemName("PC");
		healerItem = new ItemBlock(healerItemID, PixelmonBlocks.healer, 50).setItemName("Healer");
		anvilItem = new ItemBlock(anvilItemID, PixelmonBlocks.anvil, 66).setItemName("Anvil");
		thunderStoneShard = new PixelmonItem(thunderStoneShardID).setItemName("ThunderStoneShard").setIconIndex(3);
		leafStoneShard = new PixelmonItem(leafStoneShardID).setItemName("LeafStoneShard").setIconIndex(35);
		waterStoneShard = new PixelmonItem(waterStoneShardID).setItemName("WaterStoneShard").setIconIndex(19);
		fireStoneShard = new PixelmonItem(fireStoneShardID).setItemName("FireStoneShard").setIconIndex(51);
		luckyEgg = new ItemLuckyEgg(luckyEggID).setItemName("LuckyEgg").setIconIndex(7);
		expShare = new ItemExpShare(expShareID).setItemName("ExpShare").setIconIndex(23);
		berryOran = new ItemBerryOran(berryOranID).setItemName("OranBerry").setIconIndex(5);
		berryLeppa = new ItemBerryLeppa(berryLeppaID).setItemName("LeppaBerry").setIconIndex(21);
		berryRawst = new ItemBerryRawst(berryRawstID).setItemName("RawstBerry").setIconIndex(37);

		hammerWood = new ItemHammer(hammerWoodID, EnumToolMaterial.WOOD, 11 + 15 * 16).setItemName("Wood Hammer");
		hammerStone = new ItemHammer(hammerStoneID, EnumToolMaterial.STONE, 12 + 15 * 16).setItemName("Stone Hammer");
		hammerIron = new ItemHammer(hammerIronID, EnumToolMaterial.IRON, 13 + 15 * 16).setItemName("Iron Hammer");
		hammerGold = new ItemHammer(hammerGoldID, EnumToolMaterial.GOLD, 15 + 15 * 16).setItemName("Gold Hammer");
		hammerDiamond = new ItemHammer(hammerDiamondID, EnumToolMaterial.EMERALD, 14 + 15 * 16).setItemName("Diamond Hammer");
	}

	public static void addNames() {
		PixelmonItemsPokeballs.addNames();
		PixelmonItemsApricorns.addNames();
		try {
			for (Field field : PixelmonItems.class.getFields()) {
				if (field.isAnnotationPresent(Mod.Item.class)) {
					Item item = (Item) field.get(null);
					LanguageRegistry.addName(item, field.getAnnotation(Mod.Item.class).name());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
