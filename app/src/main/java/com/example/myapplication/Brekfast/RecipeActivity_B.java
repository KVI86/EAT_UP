package com.example.myapplication.Brekfast;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class RecipeActivity_B extends AppCompatActivity {
    public RelativeLayout step1,step2,step3,step4,step5,step6,step7,step8,step9,step10,step11,step12,step13,step14,step15,step16,step17,step18,step19,step20;
    public TextView coast,Recipe_name, ingredients,t_step1,t_step2,t_step3,t_step4,t_step5,t_step6,t_step7,t_step8,t_step9,t_step10,t_step11,t_step12,t_step13,t_step14,t_step15,t_step16,t_step17,t_step18,t_step19,t_step20;
    public ImageView main_image,i_step1,i_step2,i_step3,i_step4,i_step5,i_step6,i_step7,i_step8,i_step9,i_step10,i_step11,i_step12,i_step13,i_step14,i_step15,i_step16,i_step17,i_step18,i_step19,i_step20;
    public Integer Selector;
    PieChart pieChart;


    public int[] BRF_I_1 = {R.drawable.b_r_1,R.drawable.b_r1_st_1,R.drawable.b_r1_st_2,
            R.drawable.b_r1_st_3,R.drawable.b_r1_st_4,R.drawable.b_r1_st_5,R.drawable.b_r1_st_6,
            R.drawable.b_r1_st_7,R.drawable.b_r1_st_8};
    public String[] BRF_T_1 = {"Блины простые на 1 яйце","Яйца-1 шт.\nМолоко-500 мл\nСахар-3 стол.л.\nМука-200 гр\nРастительное масло-3 стол.л.\nСоль-по вкусу","Как сделать простые блины на одном яйце? Подготовьте для этого все необходимое. Муку просейте через сито, чтобы насытить её кислородом. Это необходимо для того, чтобы блинчики получились более нежные.","Для приготовления блинного теста возьмите удобную глубокую чашу, чтобы не летели\n" +
            "брызги при использовании миксера. В чашу налейте молоко и добавьте яйцо. Кстати молоко можно немного разбавить водой. Такие блинчики получатся более эластичные.","Затем влейте немного растительного масла, добавьте сахар и щепотку соли. Сахар добавляйте на свой вкус. если любите сладкие блины, то добавьте сахара немного больше.","Постепенно подсыпайте муку и замешивайте блинное тесто.","Готовое тесто должно получиться однородное, без комочков муки. Оно будет достаточно жидкое. Только из такого теста будут получаться тонкие блинчики. По количеству муки ориентируйтесь по желаемой консистенции теста. Чем гуще будет тесто, тем толще будут готовые блинчики.","Сковороду для жарки немного смажьте маслом и нагрейте до горячего состояния. Налейте немного блинного теста и распределите его по всей поверхности, наклоняя сковороду в разные стороны. Готовьте блинчики по 1-2 минуты с каждой стороны, на небольшом огне.","Готовые блинчики станут золотистого цвета. Складывайте их друг на друга на большой,плоской тарелке. Можно держать их под крышкой, чтобы они не подсыхали.","Готовые блинчики можно дополнить сметаной, сгущенкой, вареньем или джемом. Приятного угощения!","38.36"};


    public int[] BRF_I_2 = {R.drawable.b_r_2,R.drawable.b_r2_st_1,R.drawable.b_r2_st_2,
            R.drawable.b_r2_st_3,R.drawable.b_r2_st_4,R.drawable.b_r2_st_5,R.drawable.b_r2_st_6,
            R.drawable.b_r2_st_7,R.drawable.b_r2_st_8,R.drawable.b_r2_st_9,R.drawable.b_r2_st_10,
            R.drawable.b_r2_st_11,R.drawable.b_r2_st_12,R.drawable.b_r2_st_13,R.drawable.b_r2_st_14};
    public String[] BRF_T_2 = {"Завтрак из лаваша с начинкой","Лаваш тонкий - 150 гр\nЯйца - 4 шт\nБолгарский перец - 0.5 шт\nУкроп - 10 гр\nЗелень кинзы - 10 гр\nПетрушка - 10 гр\nРастительное масло - 1 стол.л\nПерец черный молотый - по вкусу\nСоль - по вкусу\nТвердый сыр - 100 гр","Как сделать завтрак из лаваша на сковороде? Подготовьте необходимые ингредиенты. Яйца берите крупные отборные. Если яйца небольшие, возьмите 5 штук.", "Болгарский перец порежьте мелкими кубиками.", "Сыр натрите на крупной терке.", "Зелень вымойте, обсушите и мелко порубите. Помимо указанной зелени можете добавить перышки зеленого лука.", "Из лаваша вырежьте 2 круга. Первый должен быть равен диаметру сковороды, а второй чуть больше. Лаваш очень быстро сохнет, поэтому круги нужно вырезать в последнюю очередь, когда овощи и зелень уже будут подготовлены. До этого лаваш лучше хранить в герметично закрытом пакете.", "Смажьте дно и бока сковороды растительным маслом. Выложите самый большой лист лаваша, чтобы получились небольшие бортики.", "На лаваш аккуратно разбейте поочередно все яйца, стараясь сохранить желток целым.Яйца посолите и поперчите.", "Присыпьте сверху большей частью тертого сыра.", "Посыпьте измельченной зеленью и болгарским перцем, оставив немного для оформления верха.", "Сверху уложите второй лист лаваша, придавив его краями нижнего лаваша.", "Поставьте сковороду на средний огонь и готовьте под крышкой примерно 5 минут. Низ лаваша должен зарумяниться, яйца схватиться, а сыр расплавиться.", "Аккуратно переверните лаваш на другую сторону.", "Присыпьте сверху оставшимся сыром. Уберите сковороду с огня и оставьте на 5 минут под крышкой, чтобы сыр расплавился.", "Готовую яичницу в лаваше переложите на блюдо, посыпьте оставшейся рубленой зеленью и измельченным болгарским перцем.","129.69"};


    public int[] BRF_I_3 = {R.drawable.b_r_3,R.drawable.b_r3_st_1,R.drawable.b_r3_st_2,
            R.drawable.b_r3_st_3,R.drawable.b_r3_st_4,R.drawable.b_r3_st_5,R.drawable.b_r3_st_6,
            R.drawable.b_r3_st_7,R.drawable.b_r3_st_8,R.drawable.b_r3_st_9,R.drawable.b_r3_st_10,
            R.drawable.b_r3_st_11,R.drawable.b_r3_st_12,R.drawable.b_r3_st_13,R.drawable.b_r3_st_14,R.drawable.b_r3_st_15};
    public String[] BRF_T_3 = {"Омлет с овощами сыром и зеленью","Яйца - 5 шт\nМолоко - 200 гр\nТвёрдый сыр - 60 гр\nСливочное масло - 30 гр\nФасоль стручковая зеленая - 35 гр\nБолгарский перец - 70 гр\nПомидоры черри - 30 гр\nСоль - по вкусу\nЗелень - 5 гр","Как сделать омлет с овощами, сыром и зеленью? Подготовьте необходимые ингредиенты.Можно взять обычные помидоры, зелень подойдет любая по вкусу и сыр тоже.", "Опустите фасоль в кипящую воду. Бланшируйте на умеренном огне около 5 минут. Откиньте фасоль на сито, чтобы стекла вода.", "Болгарский перец и помидоры помойте, обсушите. Перец можно взять одного или нескольких цветов. Нарежьте перец небольшими кубиками. Помидоры выберите спелые, но не переспевшие, с плотной кожицей, чтобы при нарезании и приготовлении они сохранили свою форму. Черри разрежьте на половинки или четвертинки в зависимости от их размера.", "Зелень помойте, обсушите, мелко нарежьте.", "Яйца взбейте вилкой до однородности.", "Влейте молоко, хорошо перемешайте.", "В яично-молочную смесь добавьте тертый сыр, перемешайте.", "На сковороде растопите сливочное масло, выложите кубики болгарского перца. На умеренном огне обжарьте перец около 5 минут, помешивая.", "Добавьте стручковую фасоль, перемешайте. Обжарьте овощи еще пару минут. Они должны быть почти мягкими, но не перепревшими. Овощи можно немного посолить. При добавлении соли учитывайте вкус используемого сыра, чтобы омлет не получился пересоленным.", "Залейте овощи на сковороде омлетной смесью.", "Выложите в омлет нарезанные помидоры.", "Посыпьте сверху омлет зеленью.", "Сковороду закройте крышкой. Готовьте омлет на огне чуть ниже среднего, чтобы он прожаривался равномерно. При сильном нагреве низ омлета подгорит, а внутри он будет еще не готов. Время приготовления будет зависеть от диаметра используемой сковороды. Чем выше омлет, тем больше времени потребуется. В среднем это 10-15 минут.", "Когда яичная смесь загустеет и станет стабильной, снимите сковороду с плиты.", "Подавать омлет можно как теплым, так и остывшим.","114.61"};


    public int[] BRF_I_4 = {R.drawable.b_r_4,R.drawable.b_r4_st_1,R.drawable.b_r4_st_2,
            R.drawable.b_r4_st_3,R.drawable.b_r4_st_4,R.drawable.b_r4_st_5,R.drawable.b_r4_st_6,
            R.drawable.b_r4_st_7,R.drawable.b_r4_st_8,R.drawable.b_r4_st_9,R.drawable.b_r4_st_10,
            R.drawable.b_r4_st_11};
    public String[] BRF_T_4 = {"Сырники из творога с мукой","Творог - 400 гр\nЯйца - 1 шт\nСахар - 30 гр\nСоль - по вкусу\nВанильный сахар - 5 гр\nПшеничная мука - 40 гр\nРастительное масло - 30 мл\n","Как сделать сырники из творога на сковороде? Отмерьте необходимые ингредиенты.Творог подойдет любой жирности. Ванильный сахар можно заменить на ванилин.","Очень важно выбрать подходящий творог. Он не должен быть влажным. Иначе придется добавлять излишнее количество муки, что сделает тесто тугим и плотным. По этой же причине не стоит использовать мягкий, пастообразный творог. Такой для сырников не подойдет. Если творог крупинчатый или хлопьями, пропустите его через блендер, чтобы получить однородную структуру. Тогда сырники получатся нежными.","Выложите творог в подходящую по размеру миску. Добавьте соль, сахар, ванильный сахар,перемешайте. Количество сахара берите по вкусу.","Добавьте к творогу взбитое яйцо, хорошо перемешайте.","Всыпьте через сито муку, тщательно перемешайте. Если тесто получается слишком вязкое, добавьте еще совсем немного муки.","Творожное тесто оставьте на столе на 15 минут. Клейковина в муке разойдется, и сырники будет легче формировать.","Стол присыпьте немного мукой, скатайте из теста колбаску. Разделите тесто на равные части в зависимости от желаемого размера сырников.","Каждую часть теста скатайте в колобок, затем прижмите, чтобы получился круглый, средней толщины сырничек. Если тесто прилипает к рукам, припудривайте их мукой.","На сковороде разогрейте растительное масло, выложите сырники. На умеренном огне обжарьте сырники до румяного цвета.","Когда сырники зарумянятся, переверните их на другую сторону и жарьте до готовности на медленном огне.","Подавайте сырники со сметаной, любыми сладкими добавками: вареньем, джемом,сгущенкой.Приятного аппетита!","167.18"};


    public int[] BRF_I_5 = {R.drawable.b_r_5,R.drawable.b_r5_st_1,R.drawable.b_r5_st_2,
            R.drawable.b_r5_st_3,R.drawable.b_r5_st_4,R.drawable.b_r5_st_5,R.drawable.b_r5_st_6,
            R.drawable.b_r5_st_7,R.drawable.b_r5_st_8,R.drawable.b_r5_st_9,R.drawable.b_r5_st_10,
            R.drawable.b_r5_st_11,R.drawable.b_r5_st_12,R.drawable.b_r5_st_13,R.drawable.b_r5_st_14};
    public String[] BRF_T_5 = {"Треугольники из лаваша с ветчиной и сыром","Лаваш тонкий - 150 гр\nТвёрдый сыр - 80 гр\nВетчина - 100 гр\nЯйца - 1 шт\nСоль - по вкусу\nСмесь перцев молотых - по вкусу\nРастительное масло - 75 мл","Как сделать треугольники из лаваша с ветчиной и сыром? Подготовьте все продукты,которые указаны в рецепте. Вместо ветчины можно использовать любую варёную или копчёную колбасу.","Сыр и ветчину натрите на тёрке с крупными зубками.","Яйцо вбейте в глубокую миску, размешайте. Добавьте щепотку соли. Мне нравится добавлять на этом этапе смесь молотых перцев, чесночный порошок и сухие травы такие как: базилик, орегано или прованские. Всё хорошо перемешайте.","Лаваш разрежьте на ровные одинаковые прямоугольники. Аккуратные и красивыетреугольники получаются из полосок лаваша длиной около 15 см. и шириной около 7 см.","Ветчину и сыр смешайте.","На край лаваша выложите начинку из сыра и ветчины.","Заверните край лаваша как на фото.","Продолжайте сворачивать.","Подворачивайте каждую сторону.","Пока не сформируете треугольник. Сделайте таким образом треугольники со всех полосок.","Окуните треугольники в яичную смесь со всех сторон.","В сковороде с толстым дном разогрейте растительное масло. Если у вас сковорода с широким дном, то возможно вам потребуется чуть больше растительного масла, чем указано в рецепте. Отправьте треугольники обжариваться на среднем огне. Готовьте до тех пор, пока бока зарумянятся.","Переверните треугольники на другую сторону и готовьте до золотистого оттенка.","Готово! Подавайте, пока не остыло!Приятного аппетита!","145.63"};


    public int[] BRF_I_6 = {R.drawable.b_r_6,R.drawable.b_r6_st_1,R.drawable.b_r6_st_2,
            R.drawable.b_r6_st_3,R.drawable.b_r6_st_4,R.drawable.b_r6_st_5,R.drawable.b_r6_st_6,
            R.drawable.b_r6_st_7};
    public String[] BRF_T_6 = {"Бекон с сыром в духовке","Бекон - 160 гр\nБрынза - 150 гр\nПармезан - 50 гр\nПлавленый сыр - 20 гр\nУкроп - 5 гр\nЧеснок - 1 шт","Как сделать бекон с сыром? Подготовьте продукты.Приготовьте форму для запекания и включите разогреваться духовку до 200С.","Брынзу извлеките из упаковки и слейте жидкость, если есть. В миску раскрошите брынзу руками или вилкой или натрите на тёрке, добавьте мелко нарезанный укроп и пропущенный через пресс чеснок.","Пармезан извлеките из упаковки и натрите на крупной тёрке. Добавьте натёртый сыр в миску к брынзе.","Добавьте туда же плавленый сыр и перемешайте. Масса должна получиться плотной,способной сохранить форму.","Ломтик бекона разложите на тарелке. Руками берите сырную массу, формируйте из неё овальные котлетки и заворачивайте в бекон. Заворачивать лучше не очень крепко и так, чтобы бекон был распределен по всей сырной массе, а она как можно меньше выглядывала на его пределы.","Форму для духовки застелите бумагой для выпечки или смажьте растительным маслом.Выложите в неё сырные рулеты. Поставьте форму в прогретую духовку на 15-20 минут примерно. Можете использовать режим верхней конвенции или гриль. Ориентируйтесь на особенности своей духовки!При желании можете присыпать тёртым сыром и сами рулеты.","Рулеты с беконом и сыром подавайте горячими. Они хорошо держат форму, но начинка из них может вытечь. На блюдо выложите сами рулеты вместе с начинкой, если она вытекла,и соком.","312.33"};


    public int[] BRF_I_7 = {R.drawable.b_r_7,R.drawable.b_r7_st_1,R.drawable.b_r7_st_2,
            R.drawable.b_r7_st_3,R.drawable.b_r7_st_4,R.drawable.b_r7_st_5,R.drawable.b_r7_st_6,
            R.drawable.b_r7_st_7};
    public String[] BRF_T_7 = {"Геркулесовая каша на молоке","Овсяные хлопья - 170 гр\nВода - 100 мл\nМолоко - 500 мл\nСоль по вкусу - 4.1 гр\nСахар по вкусу - 5 гр\nСливочное масло - 30 гр","Как варить геркулесовую кашу на молоке? Подготовьте все необходимые продукты.","Приготовьте кастрюлю с толстым дном. В такой посуде нужно варить молочные каши,чтобы они не пригорали. Влейте в кастрюлю молоко и воду.","На среднем огне, постоянно помешивая, чтобы не пригорело, доведите молоко до кипения.","Небольшими порциями всыпайте геркулес и постоянно помешивайте, чтобы хлопья равномерно распределились и не осели на дно.","Добавьте щепотку соли, перемешайте. Если вы делаете сладкую кашу, добавьте сахар.","Варите кашу на среднем огне в течение 5-20 минут. Точное время зависит от вида овсяных хлопьев, смотрите на упаковке. Если вам кажется, что каша слишком жидкая, не спешите добавлять хлопья. После упаривания геркулесовая каша станет немного гуще.","Когда каша готова, добавьте в кастрюлю сливочное масло. Перемешайте, чтобы растопленное масло равномерно разошлось по каше. Снимите кастрюлю с огня, накройте крышкой и поставьте упариваться на 10-15 минут.","65.05"};


    public int[] BRF_I_8 = {R.drawable.b_r_8,R.drawable.b_r8_st_1,R.drawable.b_r8_st_2,
            R.drawable.b_r8_st_3,R.drawable.b_r8_st_4,R.drawable.b_r8_st_5,R.drawable.b_r8_st_6,
            R.drawable.b_r8_st_7,R.drawable.b_r8_st_8,R.drawable.b_r8_st_9,R.drawable.b_r8_st_10,
            R.drawable.b_r8_st_11,R.drawable.b_r8_st_12,R.drawable.b_r8_st_13,R.drawable.b_r8_st_14,R.drawable.b_r8_st_15,R.drawable.b_r8_st_16,R.drawable.b_r8_st_17,R.drawable.b_r8_st_18};
    public String[] BRF_T_8 = {"Пицца на сковороде за 10 минут","Вареная колбаса - 150 гр\nТвёрдый сыр - 100 гр\nМаслины - 50 гр\nБолгарский перец - 100 гр\nПомидоры 1-2 шт. - 100 гр\nПерец чили зеленый - 10 гр\nБазилик 1 веточка - по вкусу\nКетчуп - 44 гр\nМайонез - 25 гр\nПаприка сушеная - 20 гр\nХмели-сунели щепотка - 1 гр\nПерец черный молотый - по вкусу\nСоль - по вкусу","Как сделать пиццу на сковороде на сметане? Подготовьте ингредиенты.","В миске соедините сметану, майонез и яйца и хорошо перемешайте венчиком до однородности.","Всыпьте просеянную муку. Снова перемешайте тесто до однородности.","В зависимости от влажности вашей сметаны, майонеза, размера яиц муки может понадобиться больше или меньше. Поэтому ориентируйтесь прежде всего на консистенцию","Должно получиться вязкое слегка текучее тесто.","Теперь приготовьте соус.","В миске соедините кетчуп, майонез, специи.","И перемешайте до однородности. Кетчуп можете заменить на томатную пасту.","Маслины предварительно выньте из рассола и обсушите. Проверьте, чтобы внутри не осталось влаги.","Болгарский перец вымойте и нарежьте кольцами или соломкой.","Вареную колбасу нарежьте небольшими тонкими пластинками.Помидоры","Помидоры нарежьте тонкими кружочками. Так как диаметр у сковороды меньше, чем противень, то и помидоры нужны не очень крупные. Идеально подойдут сливовидные. Помидоры выбирайте сочные, но плотные.","В смазанную растительным маслом большую сковороду (диаметром 26-30 см) вылейте тесто и разровняйте.","Поверх теста равномерно распределите томатный соус, не доходя до краев 1 см.","Сверху посыпьте тесто тертым сыром. Можете оставить часть сыра, чтобы посыпать верх пиццы.","Распределите по поверхности теста колбасу, помидоры, болгарский перец, маслины.","Поставьте сковороду на медленный огонь, накройте крышкой и готовьте пиццу около 15-20 минут.Через 10-15 минут тесто проверьте на готовность и если необходимо, подержите на огне еще.","Готовую пиццу посыпьте листиками базилика, нарежьте на кусочки и подайте к столу.Приятного аппетита!","244.87"};


    public int[] BRF_I_9 = {R.drawable.b_r_9,R.drawable.b_r9_st_1,R.drawable.b_r9_st_2,
            R.drawable.b_r9_st_3,R.drawable.b_r9_st_4,R.drawable.b_r9_st_5,R.drawable.b_r9_st_6};
    public String[] BRF_T_9 = {"Конвертики из слоеного теста","Слоёное тесто - 500 гр\nТворог - 300 гр\nСметана - 20 мл\nСахар - 20 гр\nЯичные желтки - 1 шт\nСливочное масло  - 30 гр","Приготовим ингредиенты по списку. В качестве начинки можно использовать творог, фарш, яблоки, вишню, джем, сыр, грибы, колбасу и иные продукты по вкусу. В данном рецепте сладкие конвертики  с творогом.","Пока тесто размораживается, приготовим творожную начинку. В миску или чашу блендера кладем творог, добавляем ложку сметаны или сливок, чтобы начинка получилась сочнее и нежнее, добавляем сахар по вкусу. Тщательно перемешиваем или растираем творог, если он крупинчатый, чтобы творожная масса стала однородной по консистенции.","Пласт теста выкладываем на подсыпанную мукой рабочую поверхность, немного раскатываем скалкой, но не очень тонко, иначе конвертики не получатся слоеными и воздушными.","Разрезаем пласт слоенного теста на квадраты или прямоугольники, как получится, одинаковые по размеру.В центр каждого квадрата теста творожную начинку. Скрепляем края теста, чтобы получился конвертик.","Конверты бывают разной формы: квадратные, прямоугольные или треугольные, поэтому и пирожкам можно смело придавать любую форму, какая нравится. на вкус это не влияет.Кладем их в смазанную маслом форму для выпекания.В мисочке взбиваем желток куриного яйца. Смазываем им заготовки слоеных пирожков-конвертиков.","Духовку разогреваем до 180 градусов. Отправляем заготовки в духовку на 15-20 минут.Ориентироваться нужно на работу своего духового шкафа. Пирожки должны хорошо зарумяниться и подняться.Вынимаем пирожки из духовки и подаем к столу, с чаем, кофе или молоком. Приятного аппетита!","197.52"};


    public int[] BRF_I_10 = {R.drawable.b_r_10,R.drawable.b_r10_st_1,R.drawable.b_r10_st_2,
            R.drawable.b_r10_st_3,R.drawable.b_r10_st_4,R.drawable.b_r10_st_5,R.drawable.b_r10_st_6};
    public String[] BRF_T_10 = {"Ленивые пирожки с яйцом и зеленым луком","Кефир - 200 мл\nМука - 200 грЯйца - 1 шт\nСода пищевая - 0.5 чайн.л\nСоль - по вкусу\nЯйца - 3 шт\nЗелёный лук - 40 гр\nРастительное масло - 30 мл","Как сделать ленивые пирожки с яйцом и зеленым луком? Начните приготовление с начинки. Яйца отварите.Очистите их от скорлупы и нарежьте средними кубиками при помощи ножа или ситечка с ячейками. Лук помойте и мелко нарежьте.","Приготовьте тесто. Как сделать заливное тесто для пирожков? В глубокую миску вбейте яйцо и всыпьте соль. Хорошо взбейте венчиком или вилкой.","Влейте кефир комнатной температуры, всыпьте соду (не гасите ее, так как она погасится кислотой, содержащейся в кефире) и все хорошо перемешайте.","Всыпьте заранее просеянную муку или сразу просейте муку в миску через ситечко. Важно просеять муку, чтобы насытить ее кислородом. Тогда выпечка получится воздушной и хорошо поднимется при выпекании. Начните замешивать тесто.По консистенции оно должно получиться гуще, чем тесто для оладий.Перемешайте до образования однородной массы без комочков.","На последнем этапе добавьте в тесто вареные яйца и зеленый лук, перемешайте. Тесто для пирожков готово.","Разогрейте на сковороде небольшое количество растительного масла. Ложкой выкладывайте тесто в виде лепешек на небольшом расстоянии друг от друга, поскольку они будут увеличиваться в размере. Жарьте пирожки на небольшом огне по 3-4 минуты с каждой стороны, чтобы они успели пропечься и не были сырыми в середине. Готовые пирожки снимите и жарьте следующие партии.Приятного аппетита!.","61.62"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_all_recipes);
        init();
        Selector = (Integer) getIntent().getExtras().get("b_recipe");
        if (Selector == 1){
            BRF_recipe_1();
        }
        else if (Selector == 2){
            BRF_recipe_2();
        }
        else if (Selector == 3){
            BRF_recipe_3();
        }
        else if (Selector == 4){
            BRF_recipe_4();
        }
        else if (Selector == 5){
            BRF_recipe_5();
        }
        else if (Selector == 6){
            BRF_recipe_6();
        }
        else if (Selector == 7){
            BRF_recipe_7();
        }
        else if (Selector == 8){
            BRF_recipe_8();
        }
        else if (Selector == 9){
            BRF_recipe_9();
        }
        else if (Selector == 10){
            BRF_recipe_10();
        }
    }

    @SuppressLint("WrongViewCast")
    public void init() {
        Recipe_name = (TextView) findViewById(R.id.Recipe_name);
        ingredients = (TextView) findViewById(R.id.ingridients);
        t_step1 = (TextView) findViewById(R.id.t_step1);
        t_step2 = (TextView) findViewById(R.id.t_step2);
        t_step3 = (TextView) findViewById(R.id.t_step3);
        t_step4 = (TextView) findViewById(R.id.t_step4);
        t_step5 = (TextView) findViewById(R.id.t_step5);
        t_step6 = (TextView) findViewById(R.id.t_step6);
        t_step7 = (TextView) findViewById(R.id.t_step7);
        t_step8 = (TextView) findViewById(R.id.t_step8);
        t_step9 = (TextView) findViewById(R.id.t_step9);
        t_step10 = (TextView) findViewById(R.id.t_step10);
        t_step11 = (TextView) findViewById(R.id.t_step11);
        t_step12 = (TextView) findViewById(R.id.t_step12);
        t_step13 = (TextView) findViewById(R.id.t_step13);
        t_step14 = (TextView) findViewById(R.id.t_step14);
        t_step15 = (TextView) findViewById(R.id.t_step15);
        t_step16 = (TextView) findViewById(R.id.t_step16);
        t_step17 = (TextView) findViewById(R.id.t_step17);
        t_step18 = (TextView) findViewById(R.id.t_step18);
        t_step19 = (TextView) findViewById(R.id.t_step19);
        t_step20 = (TextView) findViewById(R.id.t_step20);
        coast = (TextView) findViewById(R.id.coast);
        main_image = (ImageView) findViewById(R.id.main_image);
        i_step1 = (ImageView) findViewById(R.id.i_step1);
        i_step2 = (ImageView) findViewById(R.id.i_step2);
        i_step3 = (ImageView) findViewById(R.id.i_step3);
        i_step4 = (ImageView) findViewById(R.id.i_step4);
        i_step5 = (ImageView) findViewById(R.id.i_step5);
        i_step6 = (ImageView) findViewById(R.id.i_step6);
        i_step7 = (ImageView) findViewById(R.id.i_step7);
        i_step8 = (ImageView) findViewById(R.id.i_step8);
        i_step9 = (ImageView) findViewById(R.id.i_step9);
        i_step10 = (ImageView) findViewById(R.id.i_step10);
        i_step11 = (ImageView) findViewById(R.id.i_step11);
        i_step12 = (ImageView) findViewById(R.id.i_step12);
        i_step13 = (ImageView) findViewById(R.id.i_step13);
        i_step14 = (ImageView) findViewById(R.id.i_step14);
        i_step15 = (ImageView) findViewById(R.id.i_step15);
        i_step16 = (ImageView) findViewById(R.id.i_step16);
        i_step17 = (ImageView) findViewById(R.id.i_step17);
        i_step18 = (ImageView) findViewById(R.id.i_step18);
        i_step19 = (ImageView) findViewById(R.id.i_step19);
        i_step20 = (ImageView) findViewById(R.id.i_step20);
        step1 = (RelativeLayout) findViewById(R.id.step1);
        step2 = (RelativeLayout) findViewById(R.id.step2);
        step3 = (RelativeLayout) findViewById(R.id.step3);
        step4 = (RelativeLayout) findViewById(R.id.step4);
        step5 = (RelativeLayout) findViewById(R.id.step5);
        step6 = (RelativeLayout) findViewById(R.id.step6);
        step7 = (RelativeLayout) findViewById(R.id.step7);
        step8 = (RelativeLayout) findViewById(R.id.step8);
        step9 = (RelativeLayout) findViewById(R.id.step9);
        step10 = (RelativeLayout) findViewById(R.id.step10);
        step11 = (RelativeLayout) findViewById(R.id.step11);
        step12 = (RelativeLayout) findViewById(R.id.step12);
        step13 = (RelativeLayout) findViewById(R.id.step13);
        step14 = (RelativeLayout) findViewById(R.id.step14);
        step15 = (RelativeLayout) findViewById(R.id.step15);
        step16 = (RelativeLayout) findViewById(R.id.step16);
        step17 = (RelativeLayout) findViewById(R.id.step17);
        step18 = (RelativeLayout) findViewById(R.id.step18);
        step19 = (RelativeLayout) findViewById(R.id.step19);
        step20 = (RelativeLayout) findViewById(R.id.step20);

    }
    public void BRF_recipe_1(){
        Recipe_name.setText(BRF_T_1[0]);
        ingredients.setText(BRF_T_1[1]);
        t_step1.setText(BRF_T_1[2]);
        t_step2.setText(BRF_T_1[3]);
        t_step3.setText(BRF_T_1[4]);
        t_step4.setText(BRF_T_1[5]);
        t_step5.setText(BRF_T_1[6]);
        t_step6.setText(BRF_T_1[7]);
        t_step7.setText(BRF_T_1[8]);
        t_step8.setText(BRF_T_1[9]);
        coast.setText("Стоимость: " + BRF_T_1[10] + " руб");
        main_image.setImageResource(BRF_I_1[0]);
        i_step1.setImageResource(BRF_I_1[1]);
        i_step2.setImageResource(BRF_I_1[2]);
        i_step3.setImageResource(BRF_I_1[3]);
        i_step4.setImageResource(BRF_I_1[4]);
        i_step5.setImageResource(BRF_I_1[5]);
        i_step6.setImageResource(BRF_I_1[6]);
        i_step7.setImageResource(BRF_I_1[7]);
        i_step8.setImageResource(BRF_I_1[8]);
        step9.setVisibility(View.GONE);
        step10.setVisibility(View.GONE);
        step11.setVisibility(View.GONE);
        step12.setVisibility(View.GONE);
        step13.setVisibility(View.GONE);
        step14.setVisibility(View.GONE);
        step15.setVisibility(View.GONE);
        step16.setVisibility(View.GONE);
        step17.setVisibility(View.GONE);
        step18.setVisibility(View.GONE);
        step19.setVisibility(View.GONE);
        step20.setVisibility(View.GONE);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(13f,"Белки"));
        yValues.add(new PieEntry(24f,"Жиры"));
        yValues.add(new PieEntry(63f,"Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
    public void BRF_recipe_2(){
        Recipe_name.setText(BRF_T_2[0]);
        ingredients.setText(BRF_T_2[1]);
        t_step1.setText(BRF_T_2[2]);
        t_step2.setText(BRF_T_2[3]);
        t_step3.setText(BRF_T_2[4]);
        t_step4.setText(BRF_T_2[5]);
        t_step5.setText(BRF_T_2[6]);
        t_step6.setText(BRF_T_2[7]);
        t_step7.setText(BRF_T_2[8]);
        t_step8.setText(BRF_T_2[9]);
        t_step9.setText(BRF_T_2[10]);
        t_step10.setText(BRF_T_2[11]);
        t_step11.setText(BRF_T_2[12]);
        t_step12.setText(BRF_T_2[13]);
        t_step13.setText(BRF_T_2[14]);
        t_step14.setText(BRF_T_2[15]);
        coast.setText("Стоимость: " + BRF_T_2[16] + " руб");
        main_image.setImageResource(BRF_I_2[0]);
        i_step1.setImageResource(BRF_I_2[1]);
        i_step2.setImageResource(BRF_I_2[2]);
        i_step3.setImageResource(BRF_I_2[3]);
        i_step4.setImageResource(BRF_I_2[4]);
        i_step5.setImageResource(BRF_I_2[5]);
        i_step6.setImageResource(BRF_I_2[6]);
        i_step7.setImageResource(BRF_I_2[7]);
        i_step8.setImageResource(BRF_I_2[8]);
        i_step9.setImageResource(BRF_I_2[9]);
        i_step10.setImageResource(BRF_I_2[10]);
        i_step11.setImageResource(BRF_I_2[11]);
        i_step12.setImageResource(BRF_I_2[12]);
        i_step13.setImageResource(BRF_I_2[13]);
        i_step14.setImageResource(BRF_I_2[14]);
        step15.setVisibility(View.GONE);
        step16.setVisibility(View.GONE);
        step17.setVisibility(View.GONE);
        step18.setVisibility(View.GONE);
        step19.setVisibility(View.GONE);
        step20.setVisibility(View.GONE);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(30f,"Белки"));
        yValues.add(new PieEntry(32f,"Жиры"));
        yValues.add(new PieEntry(38f,"Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
    public void BRF_recipe_3(){
        Recipe_name.setText(BRF_T_3[0]);
        ingredients.setText(BRF_T_3[1]);
        t_step1.setText(BRF_T_3[2]);
        t_step2.setText(BRF_T_3[3]);
        t_step3.setText(BRF_T_3[4]);
        t_step4.setText(BRF_T_3[5]);
        t_step5.setText(BRF_T_3[6]);
        t_step6.setText(BRF_T_3[7]);
        t_step7.setText(BRF_T_3[8]);
        t_step8.setText(BRF_T_3[9]);
        t_step9.setText(BRF_T_3[10]);
        t_step10.setText(BRF_T_3[11]);
        t_step11.setText(BRF_T_3[12]);
        t_step12.setText(BRF_T_3[13]);
        t_step13.setText(BRF_T_3[14]);
        t_step14.setText(BRF_T_3[15]);
        t_step15.setText(BRF_T_3[16]);
        coast.setText("Стоимость: " + BRF_T_3[17] + " руб");
        main_image.setImageResource(BRF_I_3[0]);
        i_step1.setImageResource(BRF_I_3[1]);
        i_step2.setImageResource(BRF_I_3[2]);
        i_step3.setImageResource(BRF_I_3[3]);
        i_step4.setImageResource(BRF_I_3[4]);
        i_step5.setImageResource(BRF_I_3[5]);
        i_step6.setImageResource(BRF_I_3[6]);
        i_step7.setImageResource(BRF_I_3[7]);
        i_step8.setImageResource(BRF_I_3[8]);
        i_step9.setImageResource(BRF_I_3[9]);
        i_step10.setImageResource(BRF_I_3[10]);
        i_step11.setImageResource(BRF_I_3[11]);
        i_step12.setImageResource(BRF_I_3[12]);
        i_step13.setImageResource(BRF_I_3[13]);
        i_step14.setImageResource(BRF_I_3[14]);
        i_step15.setImageResource(BRF_I_3[15]);
        step16.setVisibility(View.GONE);
        step17.setVisibility(View.GONE);
        step18.setVisibility(View.GONE);
        step19.setVisibility(View.GONE);
        step20.setVisibility(View.GONE);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(36f,"Белки"));
        yValues.add(new PieEntry(50f,"Жиры"));
        yValues.add(new PieEntry(14f,"Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
    public void BRF_recipe_4(){
        Recipe_name.setText(BRF_T_4[0]);
        ingredients.setText(BRF_T_4[1]);
        t_step1.setText(BRF_T_4[2]);
        t_step2.setText(BRF_T_4[3]);
        t_step3.setText(BRF_T_4[4]);
        t_step4.setText(BRF_T_4[5]);
        t_step5.setText(BRF_T_4[6]);
        t_step6.setText(BRF_T_4[7]);
        t_step7.setText(BRF_T_4[8]);
        t_step8.setText(BRF_T_4[9]);
        t_step9.setText(BRF_T_4[10]);
        t_step10.setText(BRF_T_4[11]);
        t_step11.setText(BRF_T_4[12]);
        coast.setText("Стоимость: " + BRF_T_4[13] + " руб");
        main_image.setImageResource(BRF_I_4[0]);
        i_step1.setImageResource(BRF_I_4[1]);
        i_step2.setImageResource(BRF_I_4[2]);
        i_step3.setImageResource(BRF_I_4[3]);
        i_step4.setImageResource(BRF_I_4[4]);
        i_step5.setImageResource(BRF_I_4[5]);
        i_step6.setImageResource(BRF_I_4[6]);
        i_step7.setImageResource(BRF_I_4[7]);
        i_step8.setImageResource(BRF_I_4[8]);
        i_step9.setImageResource(BRF_I_4[9]);
        i_step10.setImageResource(BRF_I_4[10]);
        i_step11.setImageResource(BRF_I_4[11]);
        step12.setVisibility(View.GONE);
        step13.setVisibility(View.GONE);
        step14.setVisibility(View.GONE);
        step15.setVisibility(View.GONE);
        step16.setVisibility(View.GONE);
        step17.setVisibility(View.GONE);
        step18.setVisibility(View.GONE);
        step19.setVisibility(View.GONE);
        step20.setVisibility(View.GONE);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(33f,"Белки"));
        yValues.add(new PieEntry(37f,"Жиры"));
        yValues.add(new PieEntry(30f,"Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
    public void BRF_recipe_5(){
        Recipe_name.setText(BRF_T_5[0]);
        ingredients.setText(BRF_T_5[1]);
        t_step1.setText(BRF_T_5[2]);
        t_step2.setText(BRF_T_5[3]);
        t_step3.setText(BRF_T_5[4]);
        t_step4.setText(BRF_T_5[5]);
        t_step5.setText(BRF_T_5[6]);
        t_step6.setText(BRF_T_5[7]);
        t_step7.setText(BRF_T_5[8]);
        t_step8.setText(BRF_T_5[9]);
        t_step9.setText(BRF_T_5[10]);
        t_step10.setText(BRF_T_5[11]);
        t_step11.setText(BRF_T_5[12]);
        t_step12.setText(BRF_T_5[13]);
        t_step13.setText(BRF_T_5[14]);
        t_step14.setText(BRF_T_5[15]);
        coast.setText("Стоимость: " + BRF_T_5[16] + " руб");
        main_image.setImageResource(BRF_I_5[0]);
        i_step1.setImageResource(BRF_I_5[1]);
        i_step2.setImageResource(BRF_I_5[2]);
        i_step3.setImageResource(BRF_I_5[3]);
        i_step4.setImageResource(BRF_I_5[4]);
        i_step5.setImageResource(BRF_I_5[5]);
        i_step6.setImageResource(BRF_I_5[6]);
        i_step7.setImageResource(BRF_I_5[7]);
        i_step8.setImageResource(BRF_I_5[8]);
        i_step9.setImageResource(BRF_I_5[9]);
        i_step10.setImageResource(BRF_I_5[10]);
        i_step11.setImageResource(BRF_I_5[11]);
        i_step12.setImageResource(BRF_I_5[12]);
        i_step13.setImageResource(BRF_I_5[13]);
        i_step14.setImageResource(BRF_I_5[14]);
        step15.setVisibility(View.GONE);
        step16.setVisibility(View.GONE);
        step17.setVisibility(View.GONE);
        step18.setVisibility(View.GONE);
        step19.setVisibility(View.GONE);
        step20.setVisibility(View.GONE);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(18f,"Белки"));
        yValues.add(new PieEntry(54f,"Жиры"));
        yValues.add(new PieEntry(28f,"Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
    public void BRF_recipe_6(){
        Recipe_name.setText(BRF_T_6[0]);
        ingredients.setText(BRF_T_6[1]);
        t_step1.setText(BRF_T_6[2]);
        t_step2.setText(BRF_T_6[3]);
        t_step3.setText(BRF_T_6[4]);
        t_step4.setText(BRF_T_6[5]);
        t_step5.setText(BRF_T_6[6]);
        t_step6.setText(BRF_T_6[7]);
        t_step7.setText(BRF_T_6[8]);
        coast.setText("Стоимость: " + BRF_T_6[9] + " руб");
        main_image.setImageResource(BRF_I_6[0]);
        i_step1.setImageResource(BRF_I_6[1]);
        i_step2.setImageResource(BRF_I_6[2]);
        i_step3.setImageResource(BRF_I_6[3]);
        i_step4.setImageResource(BRF_I_6[4]);
        i_step5.setImageResource(BRF_I_6[5]);
        i_step6.setImageResource(BRF_I_6[6]);
        i_step7.setImageResource(BRF_I_6[7]);
        step8.setVisibility(View.GONE);
        step9.setVisibility(View.GONE);
        step10.setVisibility(View.GONE);
        step11.setVisibility(View.GONE);
        step12.setVisibility(View.GONE);
        step13.setVisibility(View.GONE);
        step14.setVisibility(View.GONE);
        step15.setVisibility(View.GONE);
        step16.setVisibility(View.GONE);
        step17.setVisibility(View.GONE);
        step18.setVisibility(View.GONE);
        step19.setVisibility(View.GONE);
        step20.setVisibility(View.GONE);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(45f,"Белки"));
        yValues.add(new PieEntry(53f,"Жиры"));
        yValues.add(new PieEntry(2f,"Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
    public void BRF_recipe_7(){
        Recipe_name.setText(BRF_T_7[0]);
        ingredients.setText(BRF_T_7[1]);
        t_step1.setText(BRF_T_7[2]);
        t_step2.setText(BRF_T_7[3]);
        t_step3.setText(BRF_T_7[4]);
        t_step4.setText(BRF_T_7[5]);
        t_step5.setText(BRF_T_7[6]);
        t_step6.setText(BRF_T_7[7]);
        t_step7.setText(BRF_T_7[8]);
        coast.setText("Стоимость: " + BRF_T_7[9] + " руб");
        main_image.setImageResource(BRF_I_7[0]);
        i_step1.setImageResource(BRF_I_7[1]);
        i_step2.setImageResource(BRF_I_7[2]);
        i_step3.setImageResource(BRF_I_7[3]);
        i_step4.setImageResource(BRF_I_7[4]);
        i_step5.setImageResource(BRF_I_7[5]);
        i_step6.setImageResource(BRF_I_7[6]);
        i_step7.setImageResource(BRF_I_7[7]);
        step8.setVisibility(View.GONE);
        step9.setVisibility(View.GONE);
        step10.setVisibility(View.GONE);
        step11.setVisibility(View.GONE);
        step12.setVisibility(View.GONE);
        step13.setVisibility(View.GONE);
        step14.setVisibility(View.GONE);
        step15.setVisibility(View.GONE);
        step16.setVisibility(View.GONE);
        step17.setVisibility(View.GONE);
        step18.setVisibility(View.GONE);
        step19.setVisibility(View.GONE);
        step20.setVisibility(View.GONE);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(14f,"Белки"));
        yValues.add(new PieEntry(24f,"Жиры"));
        yValues.add(new PieEntry(62f,"Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
    public void BRF_recipe_8(){
        Recipe_name.setText(BRF_T_8[0]);
        ingredients.setText(BRF_T_8[1]);
        t_step1.setText(BRF_T_8[2]);
        t_step2.setText(BRF_T_8[3]);
        t_step3.setText(BRF_T_8[4]);
        t_step4.setText(BRF_T_8[5]);
        t_step5.setText(BRF_T_8[6]);
        t_step6.setText(BRF_T_8[7]);
        t_step7.setText(BRF_T_8[8]);
        t_step8.setText(BRF_T_8[9]);
        t_step9.setText(BRF_T_8[10]);
        t_step10.setText(BRF_T_8[11]);
        t_step11.setText(BRF_T_8[12]);
        t_step12.setText(BRF_T_8[13]);
        t_step13.setText(BRF_T_8[14]);
        t_step14.setText(BRF_T_8[15]);
        t_step15.setText(BRF_T_8[16]);
        t_step16.setText(BRF_T_8[17]);
        t_step17.setText(BRF_T_8[18]);
        t_step18.setText(BRF_T_8[19]);
        coast.setText("Стоимость: " + BRF_T_8[20] + " руб");
        main_image.setImageResource(BRF_I_8[0]);
        i_step1.setImageResource(BRF_I_8[1]);
        i_step2.setImageResource(BRF_I_8[2]);
        i_step3.setImageResource(BRF_I_8[3]);
        i_step4.setImageResource(BRF_I_8[4]);
        i_step5.setImageResource(BRF_I_8[5]);
        i_step6.setImageResource(BRF_I_8[6]);
        i_step7.setImageResource(BRF_I_8[7]);
        i_step8.setImageResource(BRF_I_8[8]);
        i_step9.setImageResource(BRF_I_8[9]);
        i_step10.setImageResource(BRF_I_8[10]);
        i_step11.setImageResource(BRF_I_8[11]);
        i_step12.setImageResource(BRF_I_8[12]);
        i_step13.setImageResource(BRF_I_8[13]);
        i_step14.setImageResource(BRF_I_8[14]);
        i_step15.setImageResource(BRF_I_8[15]);
        i_step16.setImageResource(BRF_I_8[16]);
        i_step17.setImageResource(BRF_I_8[17]);
        i_step18.setImageResource(BRF_I_8[18]);
        step19.setVisibility(View.GONE);
        step20.setVisibility(View.GONE);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(25f,"Белки"));
        yValues.add(new PieEntry(44f,"Жиры"));
        yValues.add(new PieEntry(31f,"Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
    public void BRF_recipe_9(){
        Recipe_name.setText(BRF_T_9[0]);
        ingredients.setText(BRF_T_9[1]);
        t_step1.setText(BRF_T_9[2]);
        t_step2.setText(BRF_T_9[3]);
        t_step3.setText(BRF_T_9[4]);
        t_step4.setText(BRF_T_9[5]);
        t_step5.setText(BRF_T_9[6]);
        t_step6.setText(BRF_T_9[7]);
        coast.setText("Стоимость: " + BRF_T_9[8] + " руб");
        main_image.setImageResource(BRF_I_9[0]);
        i_step1.setImageResource(BRF_I_9[1]);
        i_step2.setImageResource(BRF_I_9[2]);
        i_step3.setImageResource(BRF_I_9[3]);
        i_step4.setImageResource(BRF_I_9[4]);
        i_step5.setImageResource(BRF_I_9[5]);
        i_step6.setImageResource(BRF_I_9[6]);
        step7.setVisibility(View.GONE);
        step8.setVisibility(View.GONE);
        step9.setVisibility(View.GONE);
        step10.setVisibility(View.GONE);
        step11.setVisibility(View.GONE);
        step12.setVisibility(View.GONE);
        step13.setVisibility(View.GONE);
        step14.setVisibility(View.GONE);
        step15.setVisibility(View.GONE);
        step16.setVisibility(View.GONE);
        step17.setVisibility(View.GONE);
        step18.setVisibility(View.GONE);
        step19.setVisibility(View.GONE);
        step20.setVisibility(View.GONE);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(17f,"Белки"));
        yValues.add(new PieEntry(41f,"Жиры"));
        yValues.add(new PieEntry(42f,"Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
    public void BRF_recipe_10(){
        Recipe_name.setText(BRF_T_10[0]);
        ingredients.setText(BRF_T_10[1]);
        t_step1.setText(BRF_T_10[2]);
        t_step2.setText(BRF_T_10[3]);
        t_step3.setText(BRF_T_10[4]);
        t_step4.setText(BRF_T_10[5]);
        t_step5.setText(BRF_T_10[6]);
        t_step6.setText(BRF_T_10[7]);
        coast.setText("Стоимость: " + BRF_T_10[8] + " руб");
        main_image.setImageResource(BRF_I_10[0]);
        i_step1.setImageResource(BRF_I_10[1]);
        i_step2.setImageResource(BRF_I_10[2]);
        i_step3.setImageResource(BRF_I_10[3]);
        i_step4.setImageResource(BRF_I_10[4]);
        i_step5.setImageResource(BRF_I_10[5]);
        i_step6.setImageResource(BRF_I_10[6]);
        step7.setVisibility(View.GONE);
        step8.setVisibility(View.GONE);
        step9.setVisibility(View.GONE);
        step10.setVisibility(View.GONE);
        step11.setVisibility(View.GONE);
        step12.setVisibility(View.GONE);
        step13.setVisibility(View.GONE);
        step14.setVisibility(View.GONE);
        step15.setVisibility(View.GONE);
        step16.setVisibility(View.GONE);
        step17.setVisibility(View.GONE);
        step18.setVisibility(View.GONE);
        step19.setVisibility(View.GONE);
        step20.setVisibility(View.GONE);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(24f,"Белки"));
        yValues.add(new PieEntry(22f,"Жиры"));
        yValues.add(new PieEntry(54f,"Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues,"Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
}