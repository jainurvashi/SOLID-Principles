# SOLID-Principles

Single Responsibility Principle :- Each class should be responsible for a single part or functionality of the system.
Open-Closed Principle:- Software components should be open for extension, but not for modification.
Liskov Substitution Principle:- The Liskov Substitution Principle (LSP) applies to inheritance hierarchies such that
 derived classes must be completely substitutable for their base classes.
       Barbara Liskov and John Guttag grouped these rules into three categories – the signature rule, the properties rule,
       and the methods rule.
          Signature Rule – Method Argument Types->This rule states that the overridden subtype method argument types can be
           identical or wider than the supertype method argument types.
           Java's method overriding rules support this rule by enforcing that the overridden method argument types match exactly
           with the supertype method.
          Signature Rule – Return Types -> The return type of the overridden subtype method can be narrower than the return type
           of the supertype method.
          Signature Rule – Exceptions -> The subtype method can throw fewer or narrower (but not any additional or broader)
           exceptions than the supertype method.
          Properties Rule – Class Invariants ->A class invariant is an assertion concerning object properties that must be true
           for all valid states of the object.
          Properties Rule – History Constraint -> The history constraint states that the subclass methods (inherited or new) shouldn't
           allow state changes that the base class didn't allow.
          Methods Rule – Preconditions -> A precondition should be satisfied before a method can be executed.
          Methods Rule – Postconditions -> The subtype can strengthen (but not weaken) the postcondition for a method it overrides
Interface segregation principle -> The Interface Segregation Principle (ISP) states that clients should not be forced to
 depend upon interface members they do not use. In other words, do not force any client to implement an interface that is
 irrelevant to them.
Dependency inversion principle ->The Dependency Inversion Principle (DIP) states that we should depend on abstractions
 (interfaces and abstract classes) instead of concrete implementations (classes). The abstractions should not depend on
 details; instead, the details should depend on abstractions.
