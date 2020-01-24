---
layout: project
type: project
image: images/star-wars-destiny-card.png
title: Deck Builder
permalink: projects/swd
# All dates must be YYYY-MM-DD format!
date: 2017-04-30
labels:
  - Java
summary: A deck builder for Star Wars Destiny that I made for AP computer science principles.
---

This is a program I created to create and store deck ideas for a trading card game "Star Wars Destiny."  The principle of the deck builder is that it will only allow the creation of decks which are legal in the game.  In order to do this, it actually became more of a problem of time rather than difficulty, it required that I input all the relevant rules of a card to decide wether or not it could potntially be in a deck.  I did this in a single list that ended up like this:

```java
static List<String> color = Arrays.asList("WGB0", "RVC1", "RVC2", "RVC3", "RVC4", "RVS5", "RVS6", "RVU7", "RVU8", "BVC9", 
   "BVC10", "BVC11", "BVC12", "BVU13", "BVU14", "BVU15", "BVU16", "GVU17", "GVS18", "YVC19", "YVC20", "YVC21", "YVC22", 
   "YVU23", "YVU24", "YVU25", "YVU26", "RHC27", "RHC28", "RHC29", "RHC30", "RHS31", "RHS32", "RHU33", "RHU34", "BHC35", 
   "BHC36", "BHC37", "BHC38", "BHU39", "BHU40", "BHU41", "BHU42", "GHS43", "GHU44", "YHC45", "YHC46", "YHC47", "YHC48", 
   "YHS49", "YHU50", "YHU15", "YHU52", "RNS53", "RNU54", "RNU55", "RNU56", "BNU57", "BNU58", "BNU59", "BNU60", "GNU61", 
   "GNU62", "GNU63", "YNS64", "YNU65", "YNU66", "YNU67", "RVE68", "RVE69", "RVE70", "RVE71", "RVE72", "RVE73", "RVE74", 
   "RVE75", "RVS76", "RVS77", "RVU78", "BVE79", "BVE80", "BVE81", "BVE82", "BVE83", "BVE84", "BVE85", "BVE86", "BVE87", 
   "BVS88", "BVS89", "BVU90", "GVE91", "YVE92", "YVE93", "YVE94", "YVE95", "YVE96", "YVE97", "YVE98", "YVS99", "YVS100", 
   "RVS101", "RVU102", "RHE103", "RHE104", "RHE105", "RHE106", "RHE107", "RHE108", "RHE109", "RHE110", "RHE111", "RHE112",
   "RHS113", "BHE114", "BHE115", "BHE116", "BHE117", "BHE118", "BHE119", "BHE120", "BHE121", "BHE122", "BHS123", "BHS124", 
   "BHS125", "GHE126", "YHE127", "YHE128", "YHE129", "YHE130", "YHE131", "YHE132", "YHE133", "YHE134", "YHS135", "YHS136", 
   "YHU137", "RNE138", "RNE139", "RNE140", "RNE141", "RNE142", "RNE143", "RNS144", "BNE145", "BNE146", "BNE147", "BNE148",
   "BNE149", "BNS150", "GNE151", "GNE152", "GNE153", "GNE154", "GNE155", "GNE156", "GNE157", "YNE158", "YNE159", "YNE160", 
   "YNE161", "YNE162", "YNS163", "YNU164", "GNB165", "GNB166", "GNB167", "GNB168", "GNB169", "GNB170", "GNB171", "GNB172",
   "GNB174", "GNB173");
   ```
   There was also another list that stored all the names of the cards at the same index at the cards proerties.
   
   Full code: https://github.com/sean-dunston/sean-dunston.github.io/blob/master/projects/destiny-deck-builder.java
