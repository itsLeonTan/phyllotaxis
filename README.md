# Phyllotaxis

A simple Java Swing program to visualize the phyllotaxis pattern most commonly seen in sunflowers and pinecones. Inspired by [Chapter 4 of The Algorithmic Beauty of Plants.](https://algorithmicbotany.org/papers/abop/abop.pdf)

## Preview

![Phyllotaxis](https://github.com/user-attachments/assets/966fa642-3822-4960-95f2-c1493af08721)

## The Math of Phyllotaxis

To simulate this pattern, Vogel's formula was used, which describes the position of each node in polar coordinates.

### Vogel's Formula

The position of the n-th node is given by:

$\phi_n = n \alpha$

$r_n = c \sqrt{n}$

where:
* $n = 0,1,2,\dots$ is the node index
* $\phi_n$ is the angular position
* $r_n$ is the radial distance
* $c$ is a scaling constant
* $\alpha$ is the divergence angle

The divergence angle, or Golden Angle, is $137.5^\circ$ and it ensures optimal packing:

$\alpha = 360^\circ \left(1 - \frac{1}{\varphi}\right) \approx 137.5^\circ$

where the Golden Ratio is:

$\varphi = \frac{1 + \sqrt{5}}{2}$

## Control Panel

* Delay (ms) - Control the speed of each node placement.
* Node Radius - Control the size of each node.
* Divergent Angle - The angle between each consecutive node.
* Colour Modes - Choose between fixed colors (Red, Green, Blue) or gradient-based coloring (by radius, count, or angle).
* Placement Beam - Toggle the visibility of a guiding line that shows the placement location of each node.
* Restart Buttom - To restart the simulation.

## Structure

* Phyllotaxis.java – Main program that initializes the window and adds panels.
* MainPanel.java – Handles the rendering of nodes and the phyllotaxis animation.
* ControlPanel.java – Provides the user interface with sliders, spinners, checkboxes, and buttons.
* Node.java – Used to create individual nodes and calculating its position based on the angle and index.

## Screenshots

<img width="597" height="571" alt="1" src="https://github.com/user-attachments/assets/c3b1a962-471b-4679-a39c-36705f0e392a" />
<img width="598" height="563" alt="2" src="https://github.com/user-attachments/assets/f37b1532-6c43-42e9-9af1-3ba0dd2d213f" />
<img width="598" height="556" alt="3" src="https://github.com/user-attachments/assets/c62bebaf-894f-4da7-9d40-720443b97d3c" />
<img width="595" height="570" alt="4" src="https://github.com/user-attachments/assets/a58b9f01-2035-439a-8eb9-2717e011eef2" />


