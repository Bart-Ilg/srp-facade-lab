package srpfacadelab;
import java.util.List;

public class PlayerFacade 
{
   private ItemHelper itemHelper;

   public void useItemFacade(Item item, List<IEnemy> enemies) 
   {
      itemHelper.useItemHelper(item,enemies);
   }

   public boolean GreenSwirlCheck(Item item)
   {
      return itemHelper.GreenSwirlCheckHelper(item);
   }

   public void rarityEffectCheck(Item item, IGameEngine gameEngine)
   {
      itemHelper.rarityEffectCheckHelper(item, gameEngine);
   }

   public boolean ItemInvCheck(Item item, List<Item> inventory) 
   {
      return itemHelper.ItemInvCheckHelper(item, inventory);
   }

}