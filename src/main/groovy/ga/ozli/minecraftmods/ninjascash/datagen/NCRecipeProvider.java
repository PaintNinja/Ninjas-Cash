package ga.ozli.minecraftmods.ninjascash.datagen;

import ga.ozli.minecraftmods.ninjascash.CoinItems;
import ga.ozli.minecraftmods.ninjascash.NinjasCash;
import ga.ozli.minecraftmods.ninjascash.NoteItems;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NCRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private final Int2ObjectMap<Item> denominationToItemMap = new Int2ObjectOpenHashMap<>(){{
        put(1, CoinItems.ONE_PENCE.get());
        put(2, CoinItems.TWO_PENCE.get());
        put(5, CoinItems.FIVE_PENCE.get());
        put(10, CoinItems.TEN_PENCE.get());
        put(20, CoinItems.TWENTY_PENCE.get());
        put(50, CoinItems.FIFTY_PENCE.get());
        put(100, CoinItems.ONE_POUND.get());
        put(200, CoinItems.TWO_POUNDS.get());
        put(500, NoteItems.FIVE_NOTE.get());
        put(1000, NoteItems.TEN_NOTE.get());
        put(2000, NoteItems.TWENTY_NOTE.get());
        put(5000, NoteItems.FIFTY_NOTE.get());
        put(10000, NoteItems.HUNDRED_NOTE.get());
    }};

    private final int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000}; // Representing denominations in cents

    public NCRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        List<IntList> twoPoundsPossibleCrafts = getPossibleCraftCombinations(200, denominations, 0, new IntArrayList());
        List<IntList> onePoundPossibleCrafts = getPossibleCraftCombinations(100, denominations, 0, new IntArrayList());
        List<IntList> fiftyPencePossibleCrafts = getPossibleCraftCombinations(50, denominations, 0, new IntArrayList());
        List<IntList> twentyPencePossibleCrafts = getPossibleCraftCombinations(20, denominations, 0, new IntArrayList());
        List<IntList> tenPencePossibleCrafts = getPossibleCraftCombinations(10, denominations, 0, new IntArrayList());
        List<IntList> fivePencePossibleCrafts = getPossibleCraftCombinations(5, denominations, 0, new IntArrayList());
        List<IntList> twoPencePossibleCrafts = getPossibleCraftCombinations(2, denominations, 0, new IntArrayList());
        List<IntList> onePencePossibleCrafts = getPossibleCraftCombinations(1, denominations, 0, new IntArrayList());

        List<IntList> hundredNotePossibleCrafts = getPossibleCraftCombinations(10000, denominations, 0, new IntArrayList());
        List<IntList> fiftyNotePossibleCrafts = getPossibleCraftCombinations(5000, denominations, 0, new IntArrayList());
        List<IntList> twentyNotePossibleCrafts = getPossibleCraftCombinations(2000, denominations, 0, new IntArrayList());
        List<IntList> tenNotePossibleCrafts = getPossibleCraftCombinations(1000, denominations, 0, new IntArrayList());
        List<IntList> fiveNotePossibleCrafts = getPossibleCraftCombinations(500, denominations, 0, new IntArrayList());

        createMoneyRecipes(recipeOutput, twoPoundsPossibleCrafts, CoinItems.TWO_POUNDS.get(), "two_pounds", false);
        createMoneyRecipes(recipeOutput, onePoundPossibleCrafts, CoinItems.ONE_POUND.get(), "one_pound", false);
        createMoneyRecipes(recipeOutput, fiftyPencePossibleCrafts, CoinItems.FIFTY_PENCE.get(), "fifty_pence", false);
        createMoneyRecipes(recipeOutput, twentyPencePossibleCrafts, CoinItems.TWENTY_PENCE.get(), "twenty_pence", false);
        createMoneyRecipes(recipeOutput, tenPencePossibleCrafts, CoinItems.TEN_PENCE.get(), "ten_pence", false);
        createMoneyRecipes(recipeOutput, fivePencePossibleCrafts, CoinItems.FIVE_PENCE.get(), "five_pence", false);
        createMoneyRecipes(recipeOutput, twoPencePossibleCrafts, CoinItems.TWO_PENCE.get(), "two_pence", false);
        createMoneyRecipes(recipeOutput, onePencePossibleCrafts, CoinItems.ONE_PENCE.get(), "one_pence", false);

        createMoneyRecipes(recipeOutput, hundredNotePossibleCrafts, NoteItems.HUNDRED_NOTE.get(), "one_hundred_note", true);
        createMoneyRecipes(recipeOutput, fiftyNotePossibleCrafts, NoteItems.FIFTY_NOTE.get(), "fifty_note", true);
        createMoneyRecipes(recipeOutput, twentyNotePossibleCrafts, NoteItems.TWENTY_NOTE.get(), "twenty_note", true);
        createMoneyRecipes(recipeOutput, tenNotePossibleCrafts, NoteItems.TEN_NOTE.get(), "ten_note", true);
        createMoneyRecipes(recipeOutput, fiveNotePossibleCrafts, NoteItems.FIVE_NOTE.get(), "five_note", true);

        greatestToLowestMoneyRecipe(recipeOutput, NoteItems.HUNDRED_NOTE.get(), NoteItems.FIFTY_NOTE.get(), 2, "fifty_note", "one_hundred_to_fifty");
        greatestToLowestMoneyRecipe(recipeOutput, NoteItems.FIFTY_NOTE.get(), NoteItems.TEN_NOTE.get(), 5, "ten_note", "fifty_to_ten");
        greatestToLowestMoneyRecipe(recipeOutput, NoteItems.TWENTY_NOTE.get(), NoteItems.TEN_NOTE.get(), 2, "ten_note", "twenty_to_ten");
        greatestToLowestMoneyRecipe(recipeOutput, NoteItems.TEN_NOTE.get(), NoteItems.FIVE_NOTE.get(), 2, "five_note", "ten_to_five");
        greatestToLowestMoneyRecipe(recipeOutput, NoteItems.FIVE_NOTE.get(), CoinItems.ONE_POUND.get(), 5, "one_pound", "five_to_one_pound");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.TWO_POUNDS.get(), CoinItems.ONE_POUND.get(), 2, "one_pound", "two_pounds_to_one_pound");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.ONE_POUND.get(), CoinItems.FIFTY_PENCE.get(), 2, "fifty_pence", "one_pound_to_fifty_pence");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.FIFTY_PENCE.get(), CoinItems.TEN_PENCE.get(), 5, "ten_pence", "fifty_pence_to_ten_pence");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.TWENTY_PENCE.get(), CoinItems.TEN_PENCE.get(), 2, "ten_pence", "twenty_pence_to_ten_pence");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.TEN_PENCE.get(), CoinItems.FIVE_PENCE.get(), 2, "five_pence", "ten_pence_to_five_pence");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.FIVE_PENCE.get(), CoinItems.ONE_PENCE.get(), 5, "one_pence", "five_pence_to_one_pence");
        greatestToLowestMoneyRecipe(recipeOutput, CoinItems.TWO_PENCE.get(), CoinItems.ONE_PENCE.get(), 2, "one_pence", "two_pence_to_one_pence");

        forgedNoteRecipe(recipeOutput);
    }

    private void forgedNoteRecipe(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NoteItems.FORGED_NOTE.get())
                .requires(Items.PAPER, 9)
                .unlockedBy("has_coin", has(CoinItems.TAG))
                .unlockedBy("has_note", has(NoteItems.TAG))
                .save(recipeOutput);
    }

    /**
     * This method creates a recipe that converts one item into another in descending order of value.
     * @param recipeOutput The output of the recipe.
     * @param from The item to be converted.
     * @param to The item to be obtained from the conversion.
     * @param toAmount The amount of the item to be obtained.
     * @param groupName The group name for the recipe.
     * @param recipeName The name of the recipe.
     */
    private void greatestToLowestMoneyRecipe(RecipeOutput recipeOutput, Item from, Item to, int toAmount, String groupName, String recipeName) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, to, toAmount)
                .requires(from)
                .group(groupName)
                .unlockedBy("has_coin", has(CoinItems.TAG))
                .unlockedBy("has_note", has(NoteItems.TAG))
                .save(recipeOutput, new ResourceLocation(NinjasCash.MOD_ID, recipeName));
    }

    /**
     * This method creates money recipes based on possible crafts.
     * @param recipeOutput The output of the recipe.
     * @param possibleCrafts A list of possible crafts.
     * @param result The result item of the recipe.
     * @param groupName The group name for the recipe.
     * @param isNote A boolean indicating whether the result is a note.
     */
    private void createMoneyRecipes(RecipeOutput recipeOutput, List<IntList> possibleCrafts, Item result, String groupName, boolean isNote) {
        int i = 1;
        for (IntList crafts : possibleCrafts) {
            ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result);

            for (int denomination : crafts) {
                Item item = denominationToItemMap.get(denomination);
                if (item == null) return;

                builder.requires(item);
            }

            boolean containsCoin = crafts.intStream().anyMatch(denomination -> denomination < 500);
            if (containsCoin && isNote)
                if (crafts.size() < 9)
                    builder.requires(Items.PAPER);
                else continue;

            builder.group(groupName)
                   .unlockedBy("has_coin", has(CoinItems.TAG))
                   .unlockedBy("has_note", has(NoteItems.TAG))
                   .save(recipeOutput, new ResourceLocation(NinjasCash.MOD_ID, groupName + i));

            i++;
        }
    }

    /**
     * This method returns all possible combinations of crafts that can be made for a given amount using an array of possible denominations.
     * @param amount The total amount to be crafted.
     * @param denominations An array of possible denominations.
     * @param index The current index in the denominations array.
     * @param current The current list of denominations being considered.
     * @return A list of all possible combinations of crafts.
     */
    private List<IntList> getPossibleCraftCombinations(int amount, int[] denominations, int index, IntList current) {
        List<IntList> result = new ArrayList<>();

        if (amount == 0 && current.size() <= 9 && !(current.size() == 1)) {
            result.add(new IntArrayList(current));
            return result;
        }

        if (amount < 0 || index == denominations.length || current.size() > 9)
            return result;

        int denomination = denominations[index];
        for (int i = 0; i <= amount / denomination; i++) {
            current.addAll(Collections.nCopies(i, denomination));
            result.addAll(getPossibleCraftCombinations(amount - i * denomination, denominations, index + 1, current));
            current.subList(current.size() - i, current.size()).clear();
        }

        return result;
    }
}
