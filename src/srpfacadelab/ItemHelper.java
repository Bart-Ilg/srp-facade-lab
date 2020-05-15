package srpfacadelab;

import java.util.List;

public class ItemHelper
{
   public void useItemHelper(Item item, List<IEnemy> enemies) 
   {
      if (item.getName().equals("Stink Bomb"))
      {
          for (IEnemy enemy: enemies)
          {
              enemy.takeDamage(100);
          }
      }
   }

   public boolean GreenSwirlCheckHelper(Item item)
   {
      if (item.getHeal() > 500) 
         return true;
      return false;
   }

   public void rarityEffectCheckHelper(Item item, IGameEngine gameEngine)
   {
      if (item.isRare())
            gameEngine.playSpecialEffect("cool_swirly_particles");

        if (item.isRare() && item.isUnique())
            gameEngine.playSpecialEffect("blue_swirly");

   }

   public boolean ItemInvCheckHelper(Item item, List<Item> inventory) 
   {
      for (Item i: inventory) {
         if (i.getId() == item.getId())
            return true;
      }
      return false;
   }

}