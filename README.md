# Peter Griffin MBBPH (My Big Boy Peter Helper) ┏ (゜ω゜)=☞

> Here're some jokes to lighten your mood before you get all serious and read my codes: 😁
> 1. “I have an idea so smart that my head would explode if I even began to know what I was talking about.” — Peter Griffin, Family Guy, Season 2: Love Thy Trophy
> 2. “I can be just as non-competitive as anybody. Matter of fact, I'm the most non-competitive. So I win.” — Peter Griffin, Family Guy, Season 2: Running Mates
> 3. “Now I may be an idiot, but there's one thing I am not sir, and that sir, is an idiot.” — Peter Griffin, Family Guy, Season 5: Hell Comes to Quahog
> 4. *(more? find them yourselves @ [Family Guy](https://youtu.be/ShBlLLsGcXs))!*

## 1. What am I? 😏

```

▒█▀▀█ █▀▀ ▀▀█▀▀ █▀▀ █▀▀█ 　 ▒█▀▀█ █▀▀█ ░▀░ █▀▀ █▀▀ ░▀░ █▀▀▄ 　 ▒█▀▄▀█ ▒█▀▀█ ▒█▀▀█ ▒█▀▀█ ▒█░▒█ 
▒█▄▄█ █▀▀ ░░█░░ █▀▀ █▄▄▀ 　 ▒█░▄▄ █▄▄▀ ▀█▀ █▀▀ █▀▀ ▀█▀ █░░█ 　 ▒█▒█▒█ ▒█▀▀▄ ▒█▀▀▄ ▒█▄▄█ ▒█▀▀█ 
▒█░░░ ▀▀▀ ░░▀░░ ▀▀▀ ▀░▀▀ 　 ▒█▄▄█ ▀░▀▀ ▀▀▀ ▀░░ ▀░░ ▀▀▀ ▀░░▀ 　 ▒█░░▒█ ▒█▄▄█ ▒█▄▄█ ▒█░░░ ▒█░▒█
```

Clearly, I am here to clean up Tim's mess, this is what I do daily for this lazy boy:
- Greet him with some funny words. 👋
- Scold him and make him continue working on his project. 😠
- Keep track of his todos... *(He's from CS, he's quite busy apparently)* 😔
- Remind him of his random events and his crazy deadlines. 😰

## 2. Do you want to get a piece of me? 🎃

### **Here's what you gonna do!**

1. Download this [`Bot.jar`](https://github.com/Timothyoung97/ip/releases/download/A-Jar/Bot.jar) file.
2. Open up your preferred terminal.
3. Navigate to the directory where you saved `Bot.jar`.
4. Run the following command to start using me!
   - `java -jar Bot.jar`
5. Enjoy and have fun!

## 3. Features Development 👩‍💻

- [X] Repond to the following commands:
```json
Command     Custom Input                                                         Purpose
todo        something                                                            -> Add a todo type task into the task list
event       something /at yyyy-mm-ddThh:mm:ss (Format: ISO_LOCAL_DATE_TIME)      -> Add an event type task into the task list
deadline    something /by yyyy-mm-ddThh:mm:ss (Format: ISO_LOCAL_DATE_TIME)      -> Add an deadline type task into the task list
list                                                                             -> Display all tasks with their status
done        Integer (A task indexed in the task list)                            -> Mark a task as completed
delete      Integer (A task indexed in the task list)                            -> Delete a task from the task list
find        keywords (eg find homework play)                                     -> Find tasks that contain the respective keywords
```
- [ ] Accept more date time format
- [ ] Reminders
- [ ] Filter, Sorting

## 4. Make me better? 📈

Prerequisites: JDK 11, update Intellij to the most recent version.

1. Open Intellij (if you are not in the welcome screen, click `File` > `Close Project` to close the existing project first)
2. Open the project into Intellij as follows:
   1. Click `Open`.
   1. Select the project directory, and click `OK`.
   1. If there are any further prompts, accept the defaults.
3. Configure the project to use **JDK 11** (not other versions) as explained in [here](https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk).<br>
   In the same dialog, set the **Project language level** field to the `SDK default` option.
4. After that, locate the `src/main/java/Bot.java` file, right-click it, and choose `Run Bot.main()` (if the code editor is showing compile errors, try restarting the IDE). 

```java
Bot.java

public class Bot {
    public static void main(String[] args) {
        new BotBrain().initiate();
    }
}
```

5. If the setup is correct, you should see something like the below as the output:

```ruby
	                                    ,wpp@@ppwa,
	                                ,p@R@@@@@@@@@MMM@p,
	                              a@@@MMMM%MDZ"|||,p[]g,
	                            ,@K"@@N;j**""`"uww- x   U,
	                           )TK*`""* {; "   [ +*"**,zH;..`>
	                          ,TR|       Yq,,,4-       H    ;  V
	                          BKH       .w;     "KWwwK"`      ; U
	                         ]KR          ``*+<a,JJ,aw~o`      ;"
	                         BKH                       ;;N       U
	                        jTK|                      .A-        {
	                        {KR                      -D;        |j
	                        [KR                        ;`p       J
	                        lKm            ]|            {       J
	                       z@KR            'M.|  ,AQm.|,aH       J
	                      Aj`%K             '*TT"'|`"''          J<
	                 ,~Q;KEMkK"v-                               .C Y.
	             ,wCmKK*"''"KC  `*;                            y" ,U  `>.
	          ,mTmKK'        'Y,   "<;                       ,4  ,-       *.
	        wEmKK"              "y    '*E-                 )*   A           `>
	      mTKKKP                  `*u     "*VL;         ,W`   z"    [          V`y
	   ,Am**"""**<,                   "~,      `"*~v; yPw,  x`      1          { j*
	 ,BjKK*"''      `*,                  `"~,    A   *H  `Y`         @         U A 1
	 2Ek6,gpwwwww,     ".                     '"*    "n               Mm     ,G    C
	[I$mTKKR"|    -Ey    \   /                         "               \K,,aP    ,CE
	`4KKKKR          |\   [z`                           "p              'B;Jw ,mE  H
	  mKKR            ;" 1/                              "p              '@R"'    ]
	  {KKH              \]                              "*?pz-~            @m     H
	   @KH               U                                  y               M|   /
	   `@R              ;`                                   \               H  j
	     VM               $                                   \              J- H
	      \m|              U                                 UUU              H;]
	       B%|      `      [                                   ]              E j
	    ,@R"*KM   lR|      ]                                   J              H CX
	     %@wK&"*@pE$m      [                                   J             ]`j ]
	       `BH iB| ]B`"p   U                                 -,I         z  w;|,A
	        `@mKBpl$[  ( ,B.                                 `,U       ,(g@`
	         1@@M@@@@ppa@@@@pp@Kp.     V.                    z"    ,aw@@@@M
	          %@@@@@M@@@@@@@@@@@@@@@@@ppE*@pp,,.     .,,pww%T%K@@@@@M@@M@@R
	           M@@@@@@@@@MMM@@@@@@@@@@M@@@@@@@@@@@@@@@KKKKKKKKj@@@MMM@@@MM
	            %@@@@@@@@@@@@@@@@@MMMMM@@MM@@@@@@@@@MMMppkpp@@@@@@@@@@@MR
	             "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@P
	               %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@R
	                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@M*
	                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@M@@@@@@@@@@@@@@]
	                ]@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%
	                @@@@@@@@@@@@@@@@@@@@@@@@@@M@@@@@@@@@@@@@@@@@@R
	               ]@@@@@@@@@@@@@@@@@@@@@@@@@MM@@@@@@@@@@@@@@@@@@@U
	               $@@@@@@@@@@@@@@@@@@@@@@@@@MM@@@@@@@@@@@@@@@@@@@@
	               @@@@@@@@@@@@@@@@@@@@@@@@@@@M@@@@@@@@@@@@@@@@@@@R
	               @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@M@@@U
	               8@@@@@@@@@@@@@@@@@@@@@@@@@@$@@@@@@@@@@@@@@@@@@@@@@W
	               1@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@N
	                %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	                [@@@@@@@@@@@@@@@@@@@@@@@@@@@@@R@@@@@@@@@@@@@@@@@@@@@M
	                1@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@MM*`
	                  `"%MM@@@@@@@@@@@@@@@@@@@@@MM"   `'"````"'-
	                         """"**PMMMMMP**"`-
	  .--.      .-'.      .--.      .--.      .--.      .--.      .`-.      .--.
	:::::.\::::::::.\::::::::.\::::::::.\::::::::.\::::::::.\::::::::.\::::::::.\
	'      `--'      `.-'      `--'      `--'      `--'      `-.'      `--'      `
	Hallo! My name's Peter!
	How may I be of service to you?
	  .--.      .-'.      .--.      .--.      .--.      .--.      .`-.      .--.
	:::::.\::::::::.\::::::::.\::::::::.\::::::::.\::::::::.\::::::::.\::::::::.\
	'      `--'      `.-'      `--'      `--'      `--'      `-.'      `--'      `
```
