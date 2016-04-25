# Shapes and Figures

Cette exercice focalise sur les patterns structuraux

## Intro

Un *shape* peut être **dessiné (draw) à une position donnée**.

**Circle** et **Rectangle** sont des formes avec leur propre forme

- a circle is defined by its *radius*
- a rectangle is defined by its *width and height*

Produce a **relevant ULM class diagram**, **implement it** and **write an application that creates several shapes and draws them**.
*Pour simplifier il suffit d'ecrire dans le console, la forme, sa position et ses propriétés.*

## Decorator

Shapes peut avoir plusieurs améliorations tels que :

- a **border**, définie par l'épaisseur
- a **shadow**, définie par son angle et opacité
- ... (il y a en a potentiellement d'autres)

**Utilsez un pattern décorateur *decorator design pattern*** afin de **rendre plus riche les**.
**Write an application that creates some shapes, with some enhancements**, and draws them.

## Builder

**Use the *builder design pattern* to simplify the way clients** (here the application) **create enhanced shapes**, and particularly avoiding them to explicitly handle decorators.

## Composite

A *figure* can be either:

- a **simple figure**, defined by the association of a shape (with or without enhancements) and the position where it is supposed to be placed
- a **complex figure**, defined by the combination of two figures with a constructive geometry operator (union, intersection, substraction)

Figures, as shapes, can be drawn.

**Use the *composite design pattern* to implement figures**, a **write an application that creates a (very) complex figure and draws it**.

