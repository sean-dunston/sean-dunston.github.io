---
layout: project
type: project
image: images/vex-worlds.png
title: VEX Robotics Code
permalink: projects/vex-code
# All dates must be YYYY-MM-DD format!
date: 2017-04-20
labels:
  - C
  - Robotics
summary: The code that I wrote for the 2017 VEX world robotics championship
---

I started programing for my robotics team in my sophomore year of high school, at that time all of my programs were fairly unreliable as they basically consisted of go it a distance at a set power and stop when you get there.  In a perfect world with a perfect robot this would have been fine.  As it turns out, we don't live in a perfect world and a high schooler is not capable of building a perfect robot.

By my senior year of high school, I had taken a formal programing class and was more familiar with techniques I could use to in robot C to improve my accuracy.  The main thing that I had learned to do (not directly) was to create acceleration code.  Instead of going at a set speed to my location, I would accelerate from 0 and decelerate to 0 power over the couse of the movement, this help to reduce the jolting of going from 0 power to a high power.

While there was much more complicated code, the main concept can be seen in this simple code to make the robot move a set distance forward.

```c
void forward(int distance)
{
	avgDistance = 0;
	SensorValue(Right_Drive_Encoder) = 0;
	SensorValue(Left_Drive_Encoder) = 0;
	time10[T1] = 0;
	while (avgDistance < distance)
	{
		avgDistance = (abs(SensorValue(Left_Drive_Encoder)) + abs(SensorValue(Right_Drive_Encoder))) / 2;
		int accel = time10[T1] * 3;
		int dccel = distance - avgDistance / 2;
		if (dccel < accel)
			drive(dccel);
		else
			drive(accel);
	}
	drive(0);
}
```
