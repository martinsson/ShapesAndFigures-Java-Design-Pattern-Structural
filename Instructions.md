# Shapes and Figures

Cette exercice focalise sur les patterns structuraux

## Intro

Un *shape* peut être **dessiné (draw) à une position donnée**.

**structuralPatterns.shapes.Circle** et **structuralPatterns.shapes.Rectangle** sont des formes avec leur propre forme

- a circle is defined by its *radius*
- a rectangle is defined by its *width and height*

Dessinez un **diagramme de classe ULM **, **implémentez le** et **écrivez une application qui crée au moins deux structuralPatterns.shapes et qui les dessinent**.
*Pour simplifier il suffit d'ecrire dans le console, la forme, sa position et ses propriétés.*

## Command
Utilisez le pattern command pour éviter des ifs sur le type de forme

## Decorator

Shapes peut avoir plusieurs améliorations tels que :

- a **border**, définie par l'épaisseur
- a **shadow**, définie par son angle et opacité
- ... (il y a en a potentiellement d'autres)

**Utilsez un pattern décorateur *decorator design pattern*** afin de **rendre plus riche les**.
**Write an application that creates some structuralPatterns.shapes, with some enhancements**, and draws them.

## Builder

**Use the *structuralPatterns.builder design pattern* to simplify the way clients** (here the application) **create enhanced structuralPatterns.shapes**, and particularly avoiding them to explicitly handle decorators.

## Composite

A *structuralPatterns.figures* can be either:

- a **simple structuralPatterns.figures**, defined by the association of a shape (with or without enhancements) and the position where it is supposed to be placed
- a **complex structuralPatterns.figures**, defined by the combination of two figures with a constructive geometry operator (union, intersection, substraction)

Figures, as structuralPatterns.shapes, can be drawn.

**Use the *composite design pattern* to implement figures**, a **write an application that creates a (very) complex structuralPatterns.figures and draws it**.

