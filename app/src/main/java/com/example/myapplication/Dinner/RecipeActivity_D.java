package com.example.myapplication.Dinner;

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

public class RecipeActivity_D extends AppCompatActivity {
    public RelativeLayout step1, step2, step3, step4, step5, step6, step7, step8, step9, step10, step11, step12, step13, step14, step15, step16, step17, step18, step19, step20;
    public TextView coast, Recipe_name, ingredients, t_step1, t_step2, t_step3, t_step4, t_step5, t_step6, t_step7, t_step8, t_step9, t_step10, t_step11, t_step12, t_step13, t_step14, t_step15, t_step16, t_step17, t_step18, t_step19, t_step20;
    public ImageView main_image, i_step1, i_step2, i_step3, i_step4, i_step5, i_step6, i_step7, i_step8, i_step9, i_step10, i_step11, i_step12, i_step13, i_step14, i_step15, i_step16, i_step17, i_step18, i_step19, i_step20;
    public String Selector;
    PieChart pieChart;


    public int[] DNR_I_1 = {R.drawable.d_r1, R.drawable.d_r1_st1, R.drawable.d_r1_st2, R.drawable.d_r1_st3,
            R.drawable.d_r1_st1, R.drawable.d_r1_st4, R.drawable.d_r1_st5, R.drawable.d_r1_st6};
    public String[] DNR_T_1 = {"Замороженные пельмени на сковороде жареные","Пельмени готовые - 500 гр\nВода - 100 мл\nРастительное масло - 40 мл\nПерец черный молотый - по вкусу\nСоль - по вкусу","Как жарить замороженные пельмени на сковороде? Подготовьте ингредиенты по списку. Пельмени можно заранее налепить самостоятельно или использовать готовый полуфабрикат.","Пельмени выньте из морозилки и сразу переходите к их жарке. Размораживать пельмени не нужно, иначе они станут прилипать к сковороде, тесто порвется, а мясной сок вытечет из начинки. В толстостенную сковороду налейте растительное масло, хорошо разогрейте его. Выложите в сковороду пельмени. Важно, чтобы пельмени лежали в один слой, не касались друг друга «ушками» и не слипались между собой.","Жарьте пельмени с одной стороны на сильном огне в течение 5-7 минут, чтобы они покрылись румяной и плотной корочкой, которая позволит сохранить мясной сок внутри пельменей, не позволит ему вытечь на сковороду. Затем аккуратно лопаткой переверните пельмени и также на сильном огне обжарьте их со второй стороны до румяной корочки.","После чего огонь убавьте до среднего или даже чуть меньше среднего, влейте в сковороду с пельменями половинку стакана воды, добавьте щепотку соли и черного молотого перца (если пельмени будут поданы к столу с соусом, то специй много добавлять не нужно). Накройте сковороду крышкой и тушите пельмени в воде до готовности и испарения влаги, около 10 минут.","Затем крышку со сковороды снимите, влейте еще немного растительного масла. Перемешайте пельмени и жарьте их еще немного, чтобы корочка на пельменях стала хрустящей.","Пельмени снимите со сковороды и выложите в блюдо для подачи. Посыпьте их мелко рубленной свежей зеленью и подайте к столу с каким-либо соусом или майонезом. Приятного аппетита!","160.24"};

    public int[] DNR_I_2 = {R.drawable.d_r2, R.drawable.d_r2_st1, R.drawable.d_r2_st2,
            R.drawable.d_r2_st3, R.drawable.d_r2_st4, R.drawable.d_r2_st5, R.drawable.d_r2_st6,
            R.drawable.d_r2_st7, R.drawable.d_r2_st8, R.drawable.d_r2_st9, R.drawable.d_r2_st10,
            R.drawable.d_r2_st11};
    public String[] DNR_T_2 = {"Картошка с овощами в духовке","Картошка - 1 кг\nТыква - 300 гр\nМорковь - 300 гр\nБолгарский перец - 500 гр\nЛук репчатый - 140 гр\nЧеснок - 15 гр\nРастительное масло - 40 мл\nСоль - по вкусу\nПерец черный молотый - по вкусу\nРозмарин - 2.5 гр\nИтальянские травы по желанию - 2.5 гр","Как запечь картошку с овощами в духовке? Приготовьте необходимые ингредиенты по списку. Можно также использовать для запекания кабачок или цукини, баклажан и другие овощи. Они сделают блюдо вкуснее и полезнее. Овощи желательно выбирать одинакового размера. Промойте их, обсушите, почистите, удалите семена и нарежьте одинакового размера.","Если у вас, как у меня, молодой картофель, промойте его тщательно под проточной водой с помощью щетки или губки, обсушите бумажными полотенцами. Очищать и разрезать ее не нужно. Если же вы используете клубни среднего или крупного размера, помойте, очистите от кожуры. Разрежьте сначала на две половинки, каждую из них – на ломтики, как правило, это три-четыре кусочка.","Луковицу очистите, промойте в холодной воде, обсушите бумажными полотенцами. Разрежьте на четыре части. Репчатый лук можно заменить на синий или лук шалот.","Морковку я также выбрала маленького одинакового размера и запекала целиком. Более крупную разрезала пополам. Если же вы используете морковь среднего размера, помойте ее, очистите и нарежьте на ломтики такого же размера как и картошка.","Болгарский перец выбирайте разноцветный, так блюдо будет выглядеть более красочно. Промойте его, очистите серединку от семян. Перец небольшого размера разрезать не обязательно, можно запечь целиком как и картошку с морковкой.","Более крупный мясистый болгарский перец нарежьте на ломтики среднего размера.","Помидоры берите плотные, чтобы при запекании они не потеряли форму. Помойте их, обсушите от лишней влаги бумажными полотенцами.Крупные плоды разрежьте пополам.","Тыкву желательно использовать оранжевого цвета, она, как правило слаще зеленых сортов. Она должна быть молодая, небольшого размера, свежая и сочная. Тыкву помойте, обсушите и нарежьте на небольшие кубики.","Зубчики чеснока лучше не очищать, а запекать в шелухе. Очистить его можно перед подачей блюда на стол.","Противень застелите пергаментом. Выложите все овощи, посолите, поперчите по вкусу. По желанию добавьте пряные травы, подходящие для овощей. Полейте овощи растительным маслом. Аккуратно перемешайте все овощи.","Выпекайте овощи в духовке, разогретой до 220 °, около 45 минут до мягкости картофеля. Если вы хотите сделать смесь из запеченных овощей более хрустящей, на последние 5-10 минут включите гриль Ориентируйтесь по своей духовке. Готовность проверяйте зубочисткой. Проткните картофель, если он мягкий, значит готово. Подавайте овощи горячими или теплыми как самостоятельное блюдо с подходящим соусом или в качестве гарнира к мясу или рыбе. Приятного аппетита!","307.9"};

    public int[] DNR_I_3 = {R.drawable.d_r3, R.drawable.d_r3_st1, R.drawable.d_r3_st2,
            R.drawable.d_r3_st3, R.drawable.d_r3_st4, R.drawable.d_r3_st5, R.drawable.d_r3_st6,
            R.drawable.d_r3_st7, R.drawable.d_r3_st8, R.drawable.d_r3_st9, R.drawable.d_r3_st10,
            R.drawable.d_r3_st11};
    public String[] DNR_T_3 = {"Кольца кальмара в кляре","Кальмар тушка - 200 гр\nМука - 50 гр\nЯйца - 1 шт. Квас - 45 мл\nЧеснок - 10 гр\nСоль - по вкусу\nПерец черный молотый - по вкусу Специи сухие - по вкусу\nРастительное масло - 85 гр","Как сделать кольца кальмара в кляре? Подготовьте продукты. Тушки кальмара разморозьте и очистите от пленки. Как почистить кальмары? Ошпарьте тушку кипятком — пленка сразу свернется и ее легко будет снять руками или смыть под проточной водой.","Очистив наружную часть тушки, отрежьте хвост.","Выпотрошите тушку, удалив внутренности кальмара. Обязательно уберите хитиновую пластину — твердый хрящик, проходящий внутри тушки.","Нарежьте кальмар на кольца шириной около 1 см. Обсушите кольца бумажными полотенцами, чтобы кляр не сползал во время жарки.","Приготовьте кляр. Как сделать кляр? Разбейте в миску яйцо, добавьте мелко нарезанный чеснок, соль, перец молотый и специи – по вкусу.","Хорошенько все взбейте и добавьте муку.","Взбивайте кляр венчиком или вилкой - как удобнее. А потом влейте тонкой струйкой квас, не переставая орудовать венчиком. Пузырьки воздуха, содержащиеся в квасе, сделают корочку из кляра воздушной и хрустящей.","Размешайте кляр до гладкой и в меру густой массы.","Налейте масло в сковородку или другое приспособление, в котором вы будете готовить кольца кальмара в кляре. Поставьте на плиту на средний огонь. Нагрейте масло. Проверить, достаточно ли хорошо масло разогрелось на сковороде, можно простым способом. Опустите в него деревянную лопатку. Если вокруг нее собрались пузырьки, значит можно приступать к процессу жарки. Обмакните обсохшие кольца в кляр.","Забросьте их в кипящее масло. Желательно щипцами, чтобы пальцы не обжечь. Жарьте их на среднем огне до золотистой корочки, 2-3 минуты. Готовые кольца достаньте шумовкой и положите на тарелку с бумажным полотенцем, которое впитает лишний жир.","Сразу подавайте кольца на стол, чтобы кляр оставался хрустящим. К кольцам можете подать разнообразные соусы — томатный, сметанный или майонез. приятного аппетита!","128.28 "};

    public int[] DNR_I_4 = {R.drawable.d_r4, R.drawable.d_r4_st1, R.drawable.d_r4_st2,
            R.drawable.d_r4_st3, R.drawable.d_r4_st4, R.drawable.d_r4_st5, R.drawable.d_r4_st6,
            R.drawable.d_r4_st7, R.drawable.d_r4_st8, R.drawable.d_r4_st9, R.drawable.d_r4_st10};
    public String[] DNR_T_4 = {"Курица с сыром в духовке","Куриное филе - 250 гр\nСметана - 50 гр\nТвёрдый сыр - 80 гр\nСоль - по вкусу\nЧеснок - 5 гр","Как сделать курицу с сыром в духовке? Подготовьте необходимые продукты. Вы можете взять филе любой части курицы: грудки, бедра, голени.","В сметану (сливки, майонез) добавьте измельченный чеснок. Я пропустила его через пресс, но вполне можно натереть зубчик на мелкой терке или просто измельчить его ножом.","Сыр натрите на крупной терке, половину сыра добавьте к сметане и перемешайте.","Курицу хорошо помойте, обсушите и произвольно нарежьте. Кусочки могут быть любого размера по вашему желанию.","Подготовьте жаропрочную форму для приготовления блюда. Берите форму с достаточно высокими бортиками, т.к. при запекании курица выделит сок и он может вытекать из формы.В форму выложите кусочки нарезанного куриного филе.","Посолите куриное филе. На этом этапе вы также можете добавить и другие свои любимые травы или приправы: возможно это будет острый молотый перец или хмели-сунели. Из трав наиболее предпочтительней тимьян, розмарин или традиционные свежие укроп, петрушка или кинза.","Выложите сметанный соус на курицу и перемешайте.","Сверху выложите оставшийся натертый сыр.","Форму оберните фольгой, но смотрите, чтобы она не плотно прилегала к сыру, иначе в процессе приготовления сыр расплавится и так прилипнет к фольге, что его уже ничем не отдерешь от нее. Готовьте в заранее разогретой до 180 градусов духовке около 35 минут. Минут за 10 до окончания приготовления фольгу можете убрать, если хотите получить румяную корочку. Или же запекайте полностью все время, прикрыв форму фольгой.","Подавайте запеченную курицу с сыром сразу, пока блюдо горячее. Приятного аппетита!","146.24"};

    public int[] DNR_I_5 = {R.drawable.d_r5, R.drawable.d_r5_st1, R.drawable.d_r5_st2,
            R.drawable.d_r5_st3, R.drawable.d_r5_st4, R.drawable.d_r5_st5, R.drawable.d_r5_st5};
    public String[] DNR_T_5 = {"Макароны с колбасой","Макароны любые макароны - 200 гр\nКолбаса полукопченая - 100 гр\nТвёрдый сыр - 50 гр\nТоматная паста - 100 гр\nРастительное масло - 20 мл\nСоль - по вкусу\nПерец - по вкусу","Для приготовления нужно подготовить необходимые ингредиенты. Макароны лучше брать твёрдых сортов. Томатную пасту можно заменить на кетчуп, томаты в собственном соку или свежие помидоры. На поверхности свежих плодов сделайте крестообразные надрезы и опустите их в кипяток на 1-2 минуты, затем залейте холодной водой. Снимите шкурку и пюрируйте их в блендере.","Как правильно отварить макароны? Налейте в широкую кастрюлю воду (примерно 2 литра). Поставьте на огонь. Когда закипит, посолите (на 100 г макарон около 10 г соли). Выложите макароны. Варите их на слабом огне, периодически помешивая. Чтобы макароны не слипались, влейте 1 чайн. л. растительного масла. Крышкой не закрывайте. Отварите до состояния аль денте (время варки читайте в инструкции). Откиньте на дуршлаг. Промывать водой не нужно.","Колбасу очистите от шкурки, нарежьте ее на небольшие ломтики или брусочки.Разогрейте в большой сковороде рафинированное растительное масло с высокой температурой дымления. Обжарьте колбаску, помешивая до румяной корочки.","На сковороду к колбасе добавьте отварные макароны, томаты или томатную пасту, посолите, поперчите по вкусу. Все перемешайте.","Для лучшего вкуса натрите сыр к макаронам, перемешайте. Сыр твёрдый может быть любой, главное. Накройте сковороду крышкой и подержите блюдо на слабом огне около 3-4 минут. Выключите огонь.","Подавайте блюдо горячим. В каждую тарелку выложите макароны. Сверху еще посыпьте натертым сыром и посыпьте измельченной свежей зеленью (петрушка, укроп, зеленый базилик).","300.48"};

    public int[] DNR_I_6 = {R.drawable.d_r6, R.drawable.d_r6_st1, R.drawable.d_r6_st2,
            R.drawable.d_r6_st3, R.drawable.d_r6_st4, R.drawable.d_r6_st5, R.drawable.d_r6_st6, R.drawable.d_r6_st7, R.drawable.d_r6_st8,R.drawable.d_r6_st9};
    public String[] DNR_T_6 = {"Мясо по французски из свинины с помидорами","Свинина - 500 гр\nПомидоры - 300 гр\nТвёрдый сыр - 80 гр\nМайонез - 50 гр\nРастительное масло - 20 мл\nПерец черный молотый - по вкусу\nСоль - по вкусу","Подготовьте все необходимые для блюда ингредиенты. Свинину можно использовать как целым куском (например окорок, карбонад или шею - в зависимости от того, насколько жирные кусочки вам нужны) и уже в процессе нарезать его на нужные ломтики.","Мясо вымойте, обсушите и нарежьте на ломтики толщиной около 5-7 мм. Каждый ломтик отбейте молоточком, чтобы он получился размером примерно с ладонь. Слишком сильно отбивать не нужно - чтобы мясо сохранило целостность и не имело сквозных дырочек, через которые может утекать майонез.","Мясо посолите, поперчите.","Помидоры вымойте, разрежьте пополам и нарежьте не очень толстыми полукружьями. Для рецепта желательно выбирать крепкие, мясистые и не очень водянистые помидоры.","Сыр натрите на крупной терке.","В смазанную растительным маслом форму для запекания или на противень, застеленный пергаментом, выложите ломтики свинины.","Далее распределите полукружья помидоров, укладывая из внахлест друг на друга, как черепицу.","Посыпьте все тертым сыром. Поставьте мясо по-французски в разогретую до 180°С духовку на средний уровень примерно на 40 минут. Точное время зависит от особенностей вашей духовки. Сыр сверху должен подрумяниться.","Степень подрумянивания зависит от ваших предпочтений. Приятного аппетита!","239.42"};

    public int[] DNR_I_7 = {R.drawable.d_r7, R.drawable.d_r7_st1, R.drawable.d_r7_st2,
            R.drawable.d_r7_st3, R.drawable.d_r7_st4, R.drawable.d_r7_st5, R.drawable.d_r7_st6,
            R.drawable.d_r7_st7, R.drawable.d_r7_st8, R.drawable.d_r7_st9};
    public String[] DNR_T_7 = {"Овощное рагу с курицей, картошкой и капустой","Куриные грудки - 100 гр\nКапуста белокочанная - 100 гр\nМорковь - 60 гр\nЛук репчатый - 40 гр\nЗелёный горошек - 60 гр\nРастительное масло - 60 гр\nСоль - по вкусу\nПетрушка - по вкусу\nКартошка - 150 гр","Как сделать овощное рагу с курицей? Возьмите продукты по списку. Овощи можете добавлять свои. В это рагу хорошо идут почти все, включая замороженные овощные смеси. Вместо зеленого горошка можете брать стручковую фасоль, свежую или консервированную.","Овощи хорошо вымойте и обсушите. Очистите (можете еще раз помыть и обсушить). Нарежьте репчатый лук соломкой или полукольцами.","Кубиком нарежьте картошку.","Аналогичным кубиком порежьте морковь. Хотя ее тоже можно нарезать соломкой или даже натереть на терке, если вам так больше нравится.","Белокочанную капусту нашинкуйте соломкой. Вместо такой можете использовать брокколи, брюссельскую.","Куриное мясо тоже нарежьте кусочками, равными по размеру нарезке овощей. Если сделаете так, то рагу будет выглядеть более красивым.","Обжарьте все ингредиенты в сотейнике в разогретом масле: сначала положите лук, добавьте морковь и картошку, потом капусту, потушите под крышкой, чтобы капуста обмякла.","Теперь добавьте куриное мясо, перемешайте, посолите. В самом конце добавьте зеленый горошек. Потушите до его готовности - минут 5. Можете накрыть сотейник крышкой. От плиты рекомендую не отходить, следить за блюдом и проверять его готовность.","Подавайте овощное рагу с курицей горячим, посыпав рубленой зеленью петрушки.","63.26"};

    public int[] DNR_I_8 = {R.drawable.d_r8, R.drawable.d_r8_st1, R.drawable.d_r8_st2,
            R.drawable.d_r8_st3, R.drawable.d_r8_st4, R.drawable.d_r8_st5, R.drawable.d_r8_st6,R.drawable.d_r8_st7};
    public String[] DNR_T_8 = {"Помидоры на сковороде с чесноком","Помидоры - 200 гр\nЧеснок - 10 гр\nРастительное масло - 20 мл\nСоль - по вкусу\nПерец черный молотый - по вкусу\nЗелень - по вкусу","Приготовим ингредиенты по списку. Помидоры для такого блюда нужны плотные и мясистые, чтобы при жарке они не превратились в томатное пюре. Жарить помидоры с чесноком можно не только на растительном масле, но и как более полезный вариант – на оливковом, а на сливочном – получится более ароматнее, но и калорийнее.","Помидоры моем, даем воде стечь или просушиваем бумажными полотенцами. Нарезаем томаты на кружочки толщиной около одного сантиметра. На сковороду наливаем растительное масло. Хорошо разогреваем его, выкладываем на разогретое масло кружочки помидоров. Убавляем огонь до среднего, жарим помидоры с одной стороны около двух минут, не накрывая сковороду крышкой, в противном случае помидоры пустят сок и получится томатная паста.","Пока помидоры жарятся, приготовим чеснок. Зубчики чеснока очищаем от пленочек и нарезаем их тонкими пластинками, слайсами. Чеснок придаст этому блюду аппетитный аромат и пикантный вкус.","Кружочки помидоров аккуратно переворачиваем лопаткой на сковороде. Они должны немного зарумяниться с обеих сторон.","Добавляем приготовленный чеснок, соль и черный молотый перец по вкусу. Держим овощи на огне еще 3-4 минуты, на пару минут сковороду можно прикрыть крышкой, чтобы чеснок пустил сок и сделал масло более ароматным.","Но крышку на сковороде долго не держим, чтобы помидоры не начали «расползаться». Аккуратно смещаем на сковороде помидоры с чесноком, чтобы помидоры впитали в себя ароматное масло. Выключаем огонь.","Снимаем помидоры с чесноком со сковороды, выкладываем на тарелку, сверху блюдо посыпаем мелко рубленной свежей зеленью. По желанию к этому блюду можно подать какой-либо соус по вкусу или майонез, мясное дополнение и свежий хлеб. Такое блюдо вкусно как в горячем, так и в холодном виде, но, конечно, более ароматны помидоры с чесноком, когда они теплые. Приятного аппетита!","44.09"};

    public int[] DNR_I_9 = {R.drawable.d_r9, R.drawable.d_r9_st1, R.drawable.d_r9_st2,
            R.drawable.d_r9_st3, R.drawable.d_r9_st4, R.drawable.d_r9_st5, R.drawable.d_r9_st6, R.drawable.d_r9_st7, R.drawable.d_r9_st8, R.drawable.d_r9_st9, R.drawable.d_r9_st10};
    public String[] DNR_T_9 = {"Салат из пекинской капусты и огурцов","Пекинская китайская капуста - 200 гр\nОгурцы - 100 гр\nПомидоры черри - 90 гр\nБолгарский перец - 50 гр\nАвокадо - 80 гр\nРуккола - 50 гр\nЛук сладкий фиолетовый - 40 гр\nСоль - по вкусу","Как сделать салат с капусты и огурцом? Подготовьте продукты для него. Количество продуктов можно варьировать, в зависимости от вашего вкуса. Любите огурцы - добавьте еще один, помидоры - возьмите большее количество, не переносите какие-нибудь овощи - исключите их совсем. Можете добавить еще какую-нибудь зелень или зеленый салат. Овощи предварительно помойте и обсушите.","У капусты снимите верхние листья и сполосните кочан под прохладной водой. Сильно его не мочите - китайская капуста очень рыхлая, и вода останется между листьями. Или же разберите ее на отдельные листья и сначала промойте, а затем просушите их. Лишняя влага в салате не нужна. Нарежьте капусту длинными полосками.","Огурец нарежьте колечками. Если у огурца толстая кожура, то срежьте ее.","Перец разрежьте, удалите семена. Нарежьте небольшими кусочками.","Авокадо разрежьте, очистите от кожуры. Нарежьте кусочками такими же, как перец. Одинаковая нарезка всегда красиво смотрится.","Помидорки нарежьте на четвертинки.","Лук - полукольцами.","Сложите все составляющие для салата в миску, добавьте горсть чистой и сухой руколы. Посолите салат по вкусу.","Для заправки смешайте оливковое масло и лимонный сок. Масло выбирайте самого высокого качества, первого отжима. Оно самое полезное и вкусное. Если нет оливкового масла, возьмите обычное растительное.","Добавьте заправку в салат, перемешайте. Сразу подавайте его на стол. Постояв, овощи пустят сок, и салат потеряет привлекательный вид и вкус.","176.25"};

    public int[] DNR_I_10 = {R.drawable.d_r10, R.drawable.d_r10_st1, R.drawable.d_r10_st2,
            R.drawable.d_r10_st3, R.drawable.d_r10_st4, R.drawable.d_r10_st5, R.drawable.d_r10_st6, R.drawable.d_r10_st7, R.drawable.d_r10_st8};
    public String[] DNR_T_10 = {"Салат с фасолью, кириешками и колбасой","Фасоль белая - 200 гр\nВареная колбаса - 200 гр\nСухарики кириешки - 50 гр\nТвёрдый сыр - 50 гр\nМаринованные огурцы - 300 гр\nЧеснок - 2.5 гр\nМайонез - 100 гр\nЗелёный лук - 5 гр\nУкроп - по вкусу","Для приготовления салата с кириешками и колбасой возьмите следующие продукты: колбасу (можно использовать при этом любую колбасу: копченую, вареную, ветчину или сосиски/шпикачки), кириешки - логичнее взять со вкусом и ароматом бекона/ветчины/кольбасы - какие найдутся в вашем доступе, или же взять нейтральный вкус кириешек. Добавьте фасоль, соленые или маринвоанные огурцы, твердый сыр, зелень и майонез.","Еще один обязательный компонент этого салата - фасоль, я ее специально сварила заранее, можно взять консервированную фасоль из банки, слив с нее жидкость. Фасоль может быть как белая, так и цветная.","После выбора продуктов приступаем к их непосредстенной подготовке для компоновки салата. Мелким кубиком нарезаем огурцы и колбасу. Иногда в этот салат используют свежие огурцы - это как вам нравится, на мой взгляд, для сбалансированности вкуса все же необходимо добавить кислинку - все же салат довольно жирный, чтобы эту жирность приглушить и нужна кислота.","Салат можно формировать в общем салатнике или порционно. Чаще всего его делают в большом салатнике, а подают в порционных, заправить майонезом лучше перед подачей. Но кто-то любит, чтобы все компоненты, смешанные с майонезом, немного постояли в холодильнике - главное - не передержать. Каждый продукт состоит из активных химических элементов, которые вступают друг с другом в реакции, и это - окислительные реакции.","Добавьте в салат натертый крупными лепестками сыр, в данном случае я использовала пармезан. Это острый пряный сыр, если берете более нейтральные сыры (например, Российский, Сметанковый и др.), то можете увеличить их количество.","Следующим этапом нужно натереть в салат немного чеснока - для аромата, буквально ползубчика, чтобы после поедания салата не было резкого запаха, вряд ли кто будет ему рад. Чеснок можно натереть непосредственно в майонез или прямо в салат, особой разницы нет.","Теперь заправьте все подготовленные компоненты хорошим майонезом, перемешайте его, добавьте зелень. При подаче добавьте сверху яркие кириешки.","Вот и готов наш салат с кириешками, колбасой и фасолью. Он выглядит довольно ярко и привлекательно, его уместно подавать на любой праздничный стол. Только не забудьте, что кириешки мы уже высыпаем, когда салат стоит на столе - чтобы они не размякли от заправки и не превратились в кашу.","288.07"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_all_recipes);
        init();
        Selector = (String) getIntent().getExtras().get("d_recipe");
        if (Selector.equals("d_1")) {
            DNR_recipe_1();
        } else if (Selector.equals("d_2")) {
            DNR_recipe_2();
        } else if (Selector.equals("d_3")) {
            DNR_recipe_3();
        } else if (Selector.equals("d_4")) {
            DNR_recipe_4();
        } else if (Selector.equals("d_5")) {
            DNR_recipe_5();
        } else if (Selector.equals("d_6")) {
            DNR_recipe_6();
        } else if (Selector.equals("d_7")) {
            DNR_recipe_7();
        } else if (Selector.equals("d_8")) {
            DNR_recipe_8();
        } else if (Selector.equals("d_9")) {
            DNR_recipe_9();
        } else if (Selector.equals("d_10")) {
            DNR_recipe_10();
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

    public void DNR_recipe_1() {
        Recipe_name.setText(DNR_T_1[0]);
        ingredients.setText(DNR_T_1[1]);
        t_step1.setText(DNR_T_1[2]);
        t_step2.setText(DNR_T_1[3]);
        t_step3.setText(DNR_T_1[4]);
        t_step4.setText(DNR_T_1[5]);
        t_step5.setText(DNR_T_1[6]);
        t_step6.setText(DNR_T_1[7]);
        coast.setText("Стоимость: " + DNR_T_1[8] + " руб");
        main_image.setImageResource(DNR_I_1[0]);
        i_step1.setImageResource(DNR_I_1[1]);
        i_step2.setImageResource(DNR_I_1[2]);
        i_step3.setImageResource(DNR_I_1[3]);
        i_step4.setImageResource(DNR_I_1[4]);
        i_step5.setImageResource(DNR_I_1[5]);
        i_step6.setImageResource(DNR_I_1[6]);
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
        pieChart.setExtraOffsets(5, 10, 5, 5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(11f, "Белки"));
        yValues.add(new PieEntry(33f, "Жиры"));
        yValues.add(new PieEntry(56f, "Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues, "Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }

    public void DNR_recipe_2() {
        Recipe_name.setText(DNR_T_2[0]);
        ingredients.setText(DNR_T_2[1]);
        t_step1.setText(DNR_T_2[2]);
        t_step2.setText(DNR_T_2[3]);
        t_step3.setText(DNR_T_2[4]);
        t_step4.setText(DNR_T_2[5]);
        t_step5.setText(DNR_T_2[6]);
        t_step6.setText(DNR_T_2[7]);
        t_step7.setText(DNR_T_2[8]);
        t_step8.setText(DNR_T_2[9]);
        t_step9.setText(DNR_T_2[10]);
        t_step10.setText(DNR_T_2[11]);
        t_step11.setText(DNR_T_2[12]);
        coast.setText("Стоимость: " + DNR_T_2[13] + " руб");
        main_image.setImageResource(DNR_I_2[0]);
        i_step1.setImageResource(DNR_I_2[1]);
        i_step2.setImageResource(DNR_I_2[2]);
        i_step3.setImageResource(DNR_I_2[3]);
        i_step4.setImageResource(DNR_I_2[4]);
        i_step5.setImageResource(DNR_I_2[5]);
        i_step6.setImageResource(DNR_I_2[6]);
        i_step7.setImageResource(DNR_I_2[7]);
        i_step8.setImageResource(DNR_I_2[8]);
        i_step9.setImageResource(DNR_I_2[9]);
        i_step10.setImageResource(DNR_I_2[10]);
        i_step11.setImageResource(DNR_I_2[11]);
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
        pieChart.setExtraOffsets(5, 10, 5, 5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(23f, "Белки"));
        yValues.add(new PieEntry(42f, "Жиры"));
        yValues.add(new PieEntry(35f, "Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues, "Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }

    public void DNR_recipe_3() {
        Recipe_name.setText(DNR_T_3[0]);
        ingredients.setText(DNR_T_3[1]);
        t_step1.setText(DNR_T_3[2]);
        t_step2.setText(DNR_T_3[3]);
        t_step3.setText(DNR_T_3[4]);
        t_step4.setText(DNR_T_3[5]);
        t_step5.setText(DNR_T_3[6]);
        t_step6.setText(DNR_T_3[7]);
        t_step7.setText(DNR_T_3[8]);
        t_step8.setText(DNR_T_3[9]);
        t_step9.setText(DNR_T_3[10]);
        t_step10.setText(DNR_T_3[11]);
        t_step11.setText(DNR_T_3[12]);
        coast.setText("Стоимость: " + DNR_T_3[13] + " руб");
        main_image.setImageResource(DNR_I_3[0]);
        i_step1.setImageResource(DNR_I_3[1]);
        i_step2.setImageResource(DNR_I_3[2]);
        i_step3.setImageResource(DNR_I_3[3]);
        i_step4.setImageResource(DNR_I_3[4]);
        i_step5.setImageResource(DNR_I_3[5]);
        i_step6.setImageResource(DNR_I_3[6]);
        i_step7.setImageResource(DNR_I_3[7]);
        i_step8.setImageResource(DNR_I_3[8]);
        i_step9.setImageResource(DNR_I_3[9]);
        i_step10.setImageResource(DNR_I_3[10]);
        i_step11.setImageResource(DNR_I_3[11]);
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
        pieChart.setExtraOffsets(5, 10, 5, 5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(27f, "Белки"));
        yValues.add(new PieEntry(51f, "Жиры"));
        yValues.add(new PieEntry(22f, "Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues, "Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }

    public void DNR_recipe_4() {
        Recipe_name.setText(DNR_T_4[0]);
        ingredients.setText(DNR_T_4[1]);
        t_step1.setText(DNR_T_4[2]);
        t_step2.setText(DNR_T_4[3]);
        t_step3.setText(DNR_T_4[4]);
        t_step4.setText(DNR_T_4[5]);
        t_step5.setText(DNR_T_4[6]);
        t_step6.setText(DNR_T_4[7]);
        t_step7.setText(DNR_T_4[8]);
        t_step8.setText(DNR_T_4[9]);
        t_step9.setText(DNR_T_4[10]);
        t_step10.setText(DNR_T_4[11]);
        coast.setText("Стоимость: " + DNR_T_4[12] + " руб");
        main_image.setImageResource(DNR_I_4[0]);
        i_step1.setImageResource(DNR_I_4[1]);
        i_step2.setImageResource(DNR_I_4[2]);
        i_step3.setImageResource(DNR_I_4[3]);
        i_step4.setImageResource(DNR_I_4[4]);
        i_step5.setImageResource(DNR_I_4[5]);
        i_step6.setImageResource(DNR_I_4[6]);
        i_step7.setImageResource(DNR_I_4[7]);
        i_step8.setImageResource(DNR_I_4[8]);
        i_step9.setImageResource(DNR_I_4[9]);
        i_step10.setImageResource(DNR_I_4[10]);
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
        pieChart.setExtraOffsets(5, 10, 5, 5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(66f, "Белки"));
        yValues.add(new PieEntry(31f, "Жиры"));
        yValues.add(new PieEntry(3f, "Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues, "Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }

    public void DNR_recipe_5() {
        Recipe_name.setText(DNR_T_5[0]);
        ingredients.setText(DNR_T_5[1]);
        t_step1.setText(DNR_T_5[2]);
        t_step2.setText(DNR_T_5[3]);
        t_step3.setText(DNR_T_5[4]);
        t_step4.setText(DNR_T_5[5]);
        t_step5.setText(DNR_T_5[6]);
        t_step6.setText(DNR_T_5[7]);
        coast.setText("Стоимость: " + DNR_T_5[8] + " руб");
        main_image.setImageResource(DNR_I_5[0]);
        i_step1.setImageResource(DNR_I_5[1]);
        i_step2.setImageResource(DNR_I_5[2]);
        i_step3.setImageResource(DNR_I_5[3]);
        i_step4.setImageResource(DNR_I_5[4]);
        i_step5.setImageResource(DNR_I_5[5]);
        i_step6.setImageResource(DNR_I_5[6]);
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
        pieChart.setExtraOffsets(5, 10, 5, 5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(21f, "Белки"));
        yValues.add(new PieEntry(25f, "Жиры"));
        yValues.add(new PieEntry(54f, "Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues, "Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }

    public void DNR_recipe_6() {
        Recipe_name.setText(DNR_T_6[0]);
        ingredients.setText(DNR_T_6[1]);
        t_step1.setText(DNR_T_6[2]);
        t_step2.setText(DNR_T_6[3]);
        t_step3.setText(DNR_T_6[4]);
        t_step4.setText(DNR_T_6[5]);
        t_step5.setText(DNR_T_6[6]);
        t_step6.setText(DNR_T_6[7]);
        t_step7.setText(DNR_T_6[8]);
        t_step8.setText(DNR_T_6[9]);
        t_step9.setText(DNR_T_6[10]);
        coast.setText("Стоимость: " + DNR_T_6[11] + " руб");
        main_image.setImageResource(DNR_I_6[0]);
        i_step1.setImageResource(DNR_I_6[1]);
        i_step2.setImageResource(DNR_I_6[2]);
        i_step3.setImageResource(DNR_I_6[3]);
        i_step4.setImageResource(DNR_I_6[4]);
        i_step5.setImageResource(DNR_I_6[5]);
        i_step6.setImageResource(DNR_I_6[6]);
        i_step7.setImageResource(DNR_I_6[7]);
        i_step8.setImageResource(DNR_I_6[8]);
        i_step9.setImageResource(DNR_I_6[9]);
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
        pieChart.setExtraOffsets(5, 10, 5, 5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f, "Белки"));
        yValues.add(new PieEntry(63f, "Жиры"));
        yValues.add(new PieEntry(3f, "Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues, "Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }

    public void DNR_recipe_7() {
        Recipe_name.setText(DNR_T_7[0]);
        ingredients.setText(DNR_T_7[1]);
        t_step1.setText(DNR_T_7[2]);
        t_step2.setText(DNR_T_7[3]);
        t_step3.setText(DNR_T_7[4]);
        t_step4.setText(DNR_T_7[5]);
        t_step5.setText(DNR_T_7[6]);
        t_step6.setText(DNR_T_7[7]);
        t_step7.setText(DNR_T_7[8]);
        t_step8.setText(DNR_T_7[9]);
        t_step9.setText(DNR_T_7[10]);
        coast.setText("Стоимость: " + DNR_T_7[11] + " руб");
        main_image.setImageResource(DNR_I_7[0]);
        i_step1.setImageResource(DNR_I_7[1]);
        i_step2.setImageResource(DNR_I_7[2]);
        i_step3.setImageResource(DNR_I_7[3]);
        i_step4.setImageResource(DNR_I_7[4]);
        i_step5.setImageResource(DNR_I_7[5]);
        i_step6.setImageResource(DNR_I_7[6]);
        i_step7.setImageResource(DNR_I_7[7]);
        i_step8.setImageResource(DNR_I_7[8]);
        i_step9.setImageResource(DNR_I_7[9]);
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
        pieChart.setExtraOffsets(5, 10, 5, 5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(23f, "Белки"));
        yValues.add(new PieEntry(42f, "Жиры"));
        yValues.add(new PieEntry(35f, "Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues, "Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }

    public void DNR_recipe_8() {
        Recipe_name.setText(DNR_T_8[0]);
        ingredients.setText(DNR_T_8[1]);
        t_step1.setText(DNR_T_8[2]);
        t_step2.setText(DNR_T_8[3]);
        t_step3.setText(DNR_T_8[4]);
        t_step4.setText(DNR_T_8[5]);
        t_step5.setText(DNR_T_8[6]);
        t_step6.setText(DNR_T_8[7]);
        t_step7.setText(DNR_T_8[8]);
        coast.setText("Стоимость: " + DNR_T_8[9] + " руб");
        main_image.setImageResource(DNR_I_8[0]);
        i_step1.setImageResource(DNR_I_8[1]);
        i_step2.setImageResource(DNR_I_8[2]);
        i_step3.setImageResource(DNR_I_8[3]);
        i_step4.setImageResource(DNR_I_8[4]);
        i_step5.setImageResource(DNR_I_8[5]);
        i_step6.setImageResource(DNR_I_8[6]);
        i_step7.setImageResource(DNR_I_8[7]);
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
        pieChart.setExtraOffsets(5, 10, 5, 5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(7f, "Белки"));
        yValues.add(new PieEntry(60f, "Жиры"));
        yValues.add(new PieEntry(33f, "Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues, "Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }

    public void DNR_recipe_9() {
        Recipe_name.setText(DNR_T_9[0]);
        ingredients.setText(DNR_T_9[1]);
        t_step1.setText(DNR_T_9[2]);
        t_step2.setText(DNR_T_9[3]);
        t_step3.setText(DNR_T_9[4]);
        t_step4.setText(DNR_T_9[5]);
        t_step5.setText(DNR_T_9[6]);
        t_step6.setText(DNR_T_9[7]);
        t_step7.setText(DNR_T_9[8]);
        t_step8.setText(DNR_T_9[9]);
        t_step9.setText(DNR_T_9[10]);
        t_step10.setText(DNR_T_9[11]);
        coast.setText("Стоимость: " + DNR_T_9[12] + " руб");
        main_image.setImageResource(DNR_I_9[0]);
        i_step1.setImageResource(DNR_I_9[1]);
        i_step2.setImageResource(DNR_I_9[2]);
        i_step3.setImageResource(DNR_I_9[3]);
        i_step4.setImageResource(DNR_I_9[4]);
        i_step5.setImageResource(DNR_I_9[5]);
        i_step6.setImageResource(DNR_I_9[6]);
        i_step7.setImageResource(DNR_I_9[7]);
        i_step8.setImageResource(DNR_I_9[8]);
        i_step9.setImageResource(DNR_I_9[9]);
        i_step10.setImageResource(DNR_I_9[10]);
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
        pieChart.setExtraOffsets(5, 10, 5, 5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(6f, "Белки"));
        yValues.add(new PieEntry(69f, "Жиры"));
        yValues.add(new PieEntry(25f, "Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues, "Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }

    public void DNR_recipe_10() {
        Recipe_name.setText(DNR_T_10[0]);
        ingredients.setText(DNR_T_10[1]);
        t_step1.setText(DNR_T_10[2]);
        t_step2.setText(DNR_T_10[3]);
        t_step3.setText(DNR_T_10[4]);
        t_step4.setText(DNR_T_10[5]);
        t_step5.setText(DNR_T_10[6]);
        t_step6.setText(DNR_T_10[7]);
        t_step7.setText(DNR_T_10[8]);
        t_step8.setText(DNR_T_10[9]);
        coast.setText("Стоимость: " + DNR_T_10[10] + " руб");
        main_image.setImageResource(DNR_I_10[0]);
        i_step1.setImageResource(DNR_I_10[1]);
        i_step2.setImageResource(DNR_I_10[2]);
        i_step3.setImageResource(DNR_I_10[3]);
        i_step4.setImageResource(DNR_I_10[4]);
        i_step5.setImageResource(DNR_I_10[5]);
        i_step6.setImageResource(DNR_I_10[6]);
        i_step7.setImageResource(DNR_I_10[7]);
        i_step8.setImageResource(DNR_I_10[8]);
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
        pieChart.setExtraOffsets(5, 10, 5, 5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(27f, "Белки"));
        yValues.add(new PieEntry(46f, "Жиры"));
        yValues.add(new PieEntry(27f, "Углеводы"));
        pieChart.animateY(1000, Easing.EaseInOutCubic);
        PieDataSet dataSet = new PieDataSet(yValues, "Содержание веществ");
        dataSet.setSliceSpace(0f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData data = new PieData((dataSet));
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }
}
