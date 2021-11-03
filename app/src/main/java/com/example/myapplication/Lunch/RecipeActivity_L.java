package com.example.myapplication.Lunch;

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

public class RecipeActivity_L extends AppCompatActivity {
    public RelativeLayout step1,step2,step3,step4,step5,step6,step7,step8,step9,step10,step11,step12,step13,step14,step15,step16,step17,step18,step19,step20;
    public TextView coast,Recipe_name, ingredients,t_step1,t_step2,t_step3,t_step4,t_step5,t_step6,t_step7,t_step8,t_step9,t_step10,t_step11,t_step12,t_step13,t_step14,t_step15,t_step16,t_step17,t_step18,t_step19,t_step20;
    public ImageView main_image,i_step1,i_step2,i_step3,i_step4,i_step5,i_step6,i_step7,i_step8,i_step9,i_step10,i_step11,i_step12,i_step13,i_step14,i_step15,i_step16,i_step17,i_step18,i_step19,i_step20;
    public String Selector;
    PieChart pieChart;


    public int[] LNH_I_1 = {R.drawable.l_1,R.drawable.l_r1_st_1,R.drawable.l_r1_st_2,R.drawable.l_r1_st_3,
            R.drawable.l_r1_st_1,R.drawable.l_r1_st_4,R.drawable.l_r1_st_5,R.drawable.l_r1_st_6,
            R.drawable.l_r1_st_7,R.drawable.l_r1_st_8,R.drawable.l_r1_st_9,R.drawable.l_r1_st_10,R.drawable.l_r1_st_11,R.drawable.l_r1_st_12,R.drawable.l_r1_st_13,R.drawable.l_r1_st_14};
    public String[] LNH_T_1 = {"Шампиньоны фаршированные ветчиной и сыром в духовке","Грибы - 400 гр\nТвёрдый сыр - 100 гр\nВетчина - 50 гр\nЛук репчатый - 140 гр\nСливочное масло - 50 гр\nОливковое масло - 35 мл\nСоль - по вкусу\nДушистый перец - по вкусу\nТимьян, чабрец - по вкусу\nУкроп - по вкусу","Подготовьте продукты по списку. Шампиньоны берите крупные, красивые.Аккуратно удалите у шампиньонов ножки.","Если вам не нравится плёночка на грибах, удалите ее, но она совершенно не влияет на вкус готового блюда. Ножки грибов измельчите кубиками.","Луковицу очистите, разрежьте пополам и нарежьте мелкими кубиками.","Ветчину нарежьте тонкими ломтиками, а затем - кубиками.","На разогретую сковороду с маслом выложите ножки грибочков. Я использую для жарки сливочное масло. Вы можете взять растительное, топленое, на ваш выбор.","Слегка обжарьте грибы с маслом и добавьте нарезанный лук. Снова обжарьте, помешивая.","Через 3-5 минут к смеси добавьте ветчину, специи, немного соли. Перемешайте,продолжая жарить. Ориентируйтесь на свою плиту.","Еще через несколько минут уберите сковороду с огня и переложите ее содержимое в миску. Можете добавить тимьян или другие душистые травы.","добавьте свежий измельченный укроп.","Затем в смесь добавьте сыр, натертый на крупной терке. Начинка для грибных шляпок готова!","Начинаем фаршировать. Для этого просто набирайте фарш ложкой и укладывайте его в шляпки, слегка утрамбовывая.","Переложите готовые фаршированные грибочки на противень или блюдо для духовки начинкой кверху.","Каждую шляпку накройте тонким ломтиком сыра.","Поставьте в разогретую до 180 °С духовку и запекаю 10-15 минут. Вы определяйте точное время и температуру запекания по своей духовке. Приятного аппетита!","314.73"};


    public int[] LNH_I_2 = {R.drawable.l_2,R.drawable.l_r2_st_1,R.drawable.l_r2_st_2,
            R.drawable.l_r2_st_3,R.drawable.l_r2_st_4,R.drawable.l_r2_st_5,R.drawable.l_r2_st_6,
            R.drawable.l_r2_st_7,R.drawable.l_r2_st_8,R.drawable.l_r2_st_9,R.drawable.l_r2_st_10,
            R.drawable.l_r2_st_11,R.drawable.l_r2_st_12,R.drawable.l_r2_st_13,R.drawable.l_r2_st_14,R.drawable.l_r2_st_15,R.drawable.l_r2_st_16,R.drawable.l_r2_st_17,R.drawable.l_r2_st_18};
    public String[] LNH_T_2 = {"Солянка классическая с картошкой и колбасой","Вода - 1.8 л\nГовядина - 250 гр\nКартошка - 200 гр\nКопченая колбаса - 100 гр\nВареная колбаса - 100 гр\nСоленые огурцы - 300 гр\nЛук - 40 гр\nМорковь - 40 гр\nТоматная паста - 30 гр\nРастительное масло - 20 мл\nЛавровый лист - 1 гр\nПерец черный молотый - по вкусу\nСоль - по вкусу","Как сварить классическую сборную солянку с картошкой и колбасой?Подготовьте необходимые ингредиенты. Из мяса лучше использовать говядину. Если нужен бульон понаваристее, то с костью. У меня просто мякоть без кости. Колбасу тоже можете брать любую: варено-копченую, сырокопченую или вареную. Томатную пасту можете заменить на томатный кетчуп.","Луковицу очистите. Если собираетесь использовать луковицу в зажарке, то ее нужно нарезать мелкими кубиками.","Мясо тщательно промойте. Выложите в кастрюлю говядину целым куском и целую луковицу. Залейте в кастрюлю 3,5 л воды.","Отварите мясо до готовности на среднем огне в течение 1 часа, снимая пену, которая будет выделяться при варке.","Мясо выньте из бульона и нарежьте небольшими брусочками. Размер мясных кусочков должен быть примерно такой же, как у колбасы и огурцов.","Бульон процедите, луковицу выбросите. Верните кастрюлю на огонь. Снова доведите бульон до кипения.","Картофель вымойте, очистите и нарежьте средними кубиками. Слишком мелко резать не стоит - суп варится достаточно долго и мелкий картофель может сильно развариться, а крупный неудобно есть.","Морковь очистите и натрите на крупной терке.","Соленые огурцы нарежьте брусочками.","Оба вида колбасы так же нарежьте брусочками. Так повелось, что для солянки и все нарезают брусочками, а не привычными кубиками. Считается, что от нарезки зависит вкус всего блюда, но вы, конечно, можете нарезать так, как вам нравится.","Выложите в бульон картофель и варите на среднем огне до готовности картошки (около 20 минут). Даже если картофель через это время не сварится, он дойдет до готовности уже вместе с зажаркой.","В сковороде разогрейте растительное масло. Выложите морковь, огурцы, копченую и вареную колбасу. Все перемешайте и жарьте, помешивая, на среднем огне около 5-7 минут. Это придаст всей зажарке, а впоследствии и готовой солянке легкий копченый вкус и аромат.","Добавьте в сковороду томатную пасту, перемешайте и тушите еще 2 минуты.","В кастрюлю добавьте зажарку из сковороды и перемешайте.","Суп посолите поперчите и добавьте лавровые листья. Снова доведите солянку до кипения и варите еще 10 минут.","Для подачи нам понадобятся маслины без косточек и половинка лимона, нарезанного кружочками. Их можно добавить отдельно в каждую тарелку.","Я же добавляю лимон и маслины сразу в кастрюлю с солянкой.","Накройте кастрюлю крышкой и дайте солянке настояться еще 10 минут. Приятного аппетита!","406.41"};


    public int[] LNH_I_3 = {R.drawable.l_3,R.drawable.l_r3_st_1,R.drawable.l_r3_st_2,
            R.drawable.l_r3_st_3,R.drawable.l_r3_st_4,R.drawable.l_r3_st_5,R.drawable.l_r3_st_6,
            R.drawable.l_r3_st_7,R.drawable.l_r3_st_8,R.drawable.l_r3_st_9,R.drawable.l_r3_st_10,
            R.drawable.l_r3_st_11,R.drawable.l_r3_st_12,R.drawable.l_r3_st_12};
    public String[] LNH_T_3 = {"Карп запеченный в духовке с овощами","Карп 1-1,5 кг. - 1 кг\nКартошка - 500 гр\nЛимоны - 120 гр\nЛук - 80 гр\nЧеснок 1 головка - по вкусу\nРастительное масло - 140 мл\nПомидоры черри - 200 гр\nСоль - по вкусу\nСмесь перцев молотых - по вкусу","Как запечь карпа в духовке с овощами? Подготовьте все продукты, которые указаны в рецепте по списку. Рыбу можно взять замороженную или лучше использовать свежевыловленную. Если у вас замороженный карп, то выньте его заранее из морозильной камеры и оставьте при комнатной температуре до полного размораживания.","Рыбу очистите от чешуи, выпотрошите и удалите жабры. Картофель, пару зубков чеснока и лук очистите от кожуры. Болгарский перец разрежьте вдоль на две части, удалите сердцевину и семена. Рыбу и все овощи помойте в чистой холодной воде и обсушите бумажными салфетками, чтобы избавиться от излишков влаги.","Лимон ополосните. Половину цитруса нарежьте тонкими кружочками.","В глубокой небольшой ёмкости смешайте растительное или оливковое масло, пару зубков чеснока, пропущенного через пресс, соль по вкусу, смесь молотых перцев и сухие травы. Выжмите оставшуюся половину лимона.","Картофель и болгарский перец нарежьте небольшими тонкими брусочками, лук дольками. Для яркости готового блюда используйте по возможности красный салатный лук.","Полейте измельчённые овощи половиной заправки и тщательно всё перемешайте.","Нижнюю сторону рыбы обмажьте маринадом с помощью силиконовой кисточки. Брюшко карпа начините луком, лимоном, помидорами и слегка посолите овощи.","Форму для запекания застелите пергаментной бумагой. Для приготовления карпа с овощами лучше использовать широкий лист, чтобы овощи и рыбу можно было распределить в один слой. Выложите картофель, лук, болгарский перец и помидоры на лист, посередине уложите карпа. Сделайте на тушке надрезы, как на фото.","Вставьте в каждый надрез половину дольки лимона. Головку чеснока помойте, обсушите и разрежьте пополам. Отправьте на противень. Обмажьте карпа и чеснок оставшимся маринадом.","По желанию можно сверху рыбу посыпать небольшим количеством сладкого или копчённого молотого перца.","Отправьте карпа с овощами в заранее разогретую духовку и запекайте 40-50 минут. Время и температура запекания могут варьироваться от возможностей вашей духовки.Установите температуру 220 градусов и запекайте до готовности.","Готово, можно подавать! Очень вкусно в горячем и холодном виде.","737.02"};


    public int[] LNH_I_4 = {R.drawable.l_4,R.drawable.l_r4_st1,R.drawable.l_r4_st2,
            R.drawable.l_r4_st3,R.drawable.l_r4_st4,R.drawable.l_r4_st5,R.drawable.l_r4_st6,
            R.drawable.l_r4_st7,R.drawable.l_r4_st8,R.drawable.l_r4_st9,R.drawable.l_r4_st10,
            R.drawable.l_r4_st11,R.drawable.l_r4_st12,R.drawable.l_r4_st13,R.drawable.l_r4_st14,R.drawable.l_r4_st15,R.drawable.l_r4_st16,R.drawable.l_r4_st17,R.drawable.l_r4_st18,R.drawable.l_r4_st19,R.drawable.l_r4_st20};
    public String[] LNH_T_4 = {"Капустные голубцы из свежей капусты с мясом в кастрюле","Капуста белокочанная средний вилок - 1.5 кг\nМорковь средние - 160 гр\nЛук репчатый небольшие луковицы - 700 гр\nТоматная паста - 80 гр\nРастительное масло - 80 мл\nФарш мясной - 850 гр\nРис - 50 гр\nСоль - по вкусу\nПерец черный молотый - по вкусу\nБазилик - 5 гр\nПаприка - 5 гр\nЛавровый лист - 2 гр","Как готовить голубцы из свежей капусты? Подготовьте необходимые ингредиенты дляприготовления капустных голубцов из свежей капусты с мясом в кастрюле. Рис можно взять как круглый, так и длиннозерный. Фарш используйте любой по желанию.","Для отваривания кочана выберите большую просторную кастрюлю, чтобы между кочаном и стенками было досточно свободного места. Поместите кочан в кастрюлю, залейте водой,доведите до кипения. Проварите капусту около 2 минут. За это время верхние листьястанут мягкими. С помощью вилки придерживайте кочан и ножом отрежьте пару верхнихлистьев у основания.","Таким образом постепенно отварите все листья, подходящие для фарширования. Они должны быть мягкими, но не переваренными. У меня получилось 16 капустных листьев разного размера.","Рис тщательно промойте в воде несколько раз. Отварите рис в кипящей подсоленной воде почти до готовности. Откиньте готовый рис на сито, чтобы стекла вода.","Приготовьте томатную заливку. Предварительно вымытую в воде со щеткой морковь очистите, измельчите на крупной терке.","Лук очистите, помойте. Половину лука измельчите на средней терке, он понадобится для фарша. Остальной лук нарежьте мелкими кубиками. У меня был синий лук. Можно, конечно, взять обычный белый лук.","Фарш соедините с измельченным луком и вареным рисом. Посолите, добавьте черный молотый перец, хорошо перемешайте.","На сковороде разогрейте растительное масло, выложите подготовленные морковь и нарезанный лук. Обжарьте овощи на среднем огне, периодически помешивая, до полуготовности.","Выложите к овощам томатную пасту, перемешайте.","Залейте овощи водой, чтобы они были полностью покрыты, доведите до кипения.","Добавьте паприку и базилик, немного посолите, перемешайте. Приправы и специи используйте любые по вкусу.","Сковороду с томатной заливкой прикройте крышкой и снимите с огня.","Аккуратно острым ножом срежьте утолщение в основании каждого капустного листа, чтобы было легко сворачивать лист.","На основание листа выложите порцию фарша.","Плотно сверните голубец конвертиком.","Аналогично нафаршируйте все капустные листья. На дно кастрюли выложите слой подготовленных голубцов.","Сверху распределите половину овощей из томатной заливки.","Затем выложите снова голубцы и залейте оставшейся томатной заливкой.","Поставьте кастрюлю с голубцами на плиту, доведите до кипения. Тушите голубцы на умеренном огне около 40 минут. За 7-10 минут до готовности добавьте лавровый лист.","Подавайте голубцы горячими. Приятного аппетита!","385.65"};


    public int[] LNH_I_5 = {R.drawable.l_5,R.drawable.l_r5_st1,R.drawable.l_r5_st2,
            R.drawable.l_r5_st3,R.drawable.l_r5_st4,R.drawable.l_r5_st5,R.drawable.l_r5_st6,
            R.drawable.l_r5_st7,R.drawable.l_r5_st8,R.drawable.l_r5_st9,R.drawable.l_r5_st10,
            R.drawable.l_r5_st11};
    public String[] LNH_T_5 = {"Борщ со свежей капустой","Свинина - 600 гр\nКапуста - 200 гр\nКартошка - 450 гр\nЛук - 80 гр\nМорковь - 80 гр\nПомидоры - 200 гр\nСвекла - 250 гр\nТоматная паста - 60 гр\nВода - 2.5 л\nЛавровый лист - 1 гр\nСоль - по вкусу\nСпеции сухие - по вкусу","Как сварить борщ со свежей капустой, свеклой и мясом? Подготовьте для этого необходимые ингредиенты. Капусту берите свежую. Овощи хорошо помойте от загрязнений и очистите от кожуры.","Свинину можно использовать любую часть. Но если варить свинину на кости, то бульон будет получаться более наваристый. Поместите свинину в холодную воду, доведите до кипения и варите 1-1,5 часа. При закипании снимайте пенку, которая будет появляться.Готовый бульон процедите. Мясо нарежьте на кусочки и верните в кастрюлю.","Капусту нашинкуйте, а картофель нарежьте на кусочки.","Выложите капусту и картофель в кастрюлю с кипящим бульоном и оставьте вариться минут на 15.","В это время мелко нарежьте лук и натрите на терке морковь.","Обжарьте лук и морковь в течение 4-5 минут на небольшом огне. Затем добавьте в зажарку нарезанные помидоры. Обжаривайте все вместе еще 3-4 минуты. За это время помидоры пустят сок и станут мягкие.","Готовую зажарку выложите в кастрюлю.","Отдельно обжарьте свеклу, натертую на терке. Добавьте к ней немного томатной пасты. Она придаст борщу небольшую кислинку и насыщенный цвет. На жарку свеклы уйдет еще минут 5-7. За время жарки она немного уменьшится в размере.","Выложите обжаренную свеклу в кастрюлю. Добавьте лавровый лист. По вкусу добавьте немного соли и специи. Перемешайте, доведите до кипения и снимите с огня. Кипятить со свеклой борщ не надо. От этого он потеряет цвет. Готовый борщ накройте крышкой и оставьте постоять минут на 15-20, чтобы он немного настоялся.","Готовый борщ подавайте украсив зеленью и добавьте ложечку сметаны"," Приятного аппетита!","262.71"};


    public int[] LNH_I_6 = {R.drawable.l_6,R.drawable.l_r6_st1,R.drawable.l_r6_st2,
            R.drawable.l_r6_st3,R.drawable.l_r6_st4,R.drawable.l_r6_st5,R.drawable.l_r6_st6,R.drawable.l_r6_st7,R.drawable.l_r6_st8,R.drawable.l_r6_st9,R.drawable.l_r6_st10,R.drawable.l_r6_st11,R.drawable.l_r6_st12,R.drawable.l_r6_st13,R.drawable.l_r6_st14};
    public String[] LNH_T_6 = {"Грибной суп из сушеных белых грибов","Сушёные грибы белые - 50 гр\nВода - 1.8 л\nКартошка - 450 гр\nЛук репчатый - 140 гр\nМорковь - 80 гр\nРастительное масло - 40 мл\nСоль - по вкусу\nУкроп - по вкусу\nПерец черный молотый - по вкусу","Подготовим все необходимые ингредиенты для приготовления нашего грибного супа из белых сушеных грибов. Конечно, сварить такой суп можно из любых грибов, но из белых получается самый ароматный.","Замачиваем наши белые грибы в 300 миллилитрах холодной воды и оставляем в прохладном месте на 12 часов.","Картофель почистим и вымоем. Две картошины нарезаем соломкой, но вы можете порезать ее и крупным кубиком, если так больше нравится. Положите картофельную соломку в миску и залейте холодной водой, пусть постоит пока.","В кастрюлю нальем 1.5 литра воды и положим оставшуюся картошку (я разрезала пополам, так как она была большой). Ставим на средний огонь, доводим до кипения, солим и варим до готовности картофеля.","Пока картошка варится, займемся грибами. Достанем их из воды, она понадобится немного позже, и нарезаем. Я нарезала крупной соломкой, как картошку. Если вы порезали картофель кубиком, то и грибы нужно порезать на кусочки. Так овощи и грибы будут лучше гармонировать. В сковороду наливаем половину масла и кладем порезанные грибы.","Обжариваем их на среднем огне в течение 5-7 минут. Это придаст им цвет и раскроет сильнее грибной запах.","После того как грибы обжарились, добавляем в кастрюлю с картофелем. Вливаем туда процеженную воду после замачивания грибов и добавляем резаную картошку. Доводим все до кипения и на маленьком огне, продолжаем варить.","Пока варится суп, мы сделаем зажарку. Для этого в сковороду где жарились грибы вливаем оставшееся масло и ставим на средний огонь, разогреваем. Лук чистим, споласкиваем и нарезаем, кладем в сковороду.","Морковь чистим, моем и натираем на мелкой терке, добавляем в сковороду с луком. Вы можете натереть морковь и на крупной терке, все зависит от вашего вкуса.","Все перемешиваем и обжариваем в течение 7 минут, до готовности овощей.","Добавляем нашу зажарку в суп.","Из кастрюли вынимаем картофель который мы варили целиком и разминаем его вилкой. Вновь отправляем его в кастрюлю. Это придаст супу мягкость и наваристый вкус. Варим еще несколько минут до готовности картофеля, который порезали соломкой.","Укроп споласкиваем, мелко режем и кладем в суп. Доводим до кипения, доводим до вкуса по соли и снимаем с огня. Наш грибной суп из сушеных белых грибов готов.","Приятного аппетита.","401.83"};


    public int[] LNH_I_7 = {R.drawable.l_7,R.drawable.l_r7_st1,R.drawable.l_r7_st2,
            R.drawable.l_r7_st3,R.drawable.l_r7_st4,R.drawable.l_r7_st5,R.drawable.l_r7_st6,
            R.drawable.l_r7_st7,R.drawable.l_r7_st8,R.drawable.l_r7_st9,R.drawable.l_r7_st10,R.drawable.l_r7_st11};
    public String[] LNH_T_7 = {"Курица запеченная с рисом","Куриные крылышки - 400 гр\nАпельсины - 300 гр\nЛимоны - 60 гр\nВино белое - 150 мл\nКарри - 10 гр\nПерец чили - по вкусу\nБульон - 200 мл\nРис длиннозернистый пропаренный - 345 гр\nПерец черный молотый - по вкусу\nСоль - по вкусу","Для этого рецепта можно взять любые части курицы: бедра, окорочка или целую тушку, разрезанную на куски. Для маринада тоже можно выбрать на ваш вкус – сухое, полусухое или полусладкое.","Снять цедру с лимона, выжать сок. В этом рецепте понадобится примерно 1 ч.л. лимонного сока. Из одного апельсина выжать сок, второй очистить от кожуры и пленок, мякоть порвать на маленькие кусочки.","Перец порезать колечками. Чили можно взять свежий или сушеный, у меня – маленькие очень острые маринованные перцы пири-пири. Семена можно удалить или оставить: с ними блюдо получается намного острее.","В миске смешать вино, лимонный и апельсиновый сок, добавить кусочки апельсина, кольца перца и соль. Размешать до растворения соли.","Добавить карри и черный перец, перемешать.","Залить курицу маринадом и оставить на 30 минут.","На дно плоской формы для запекания высыпать рис, разровнять.","Залить его бульоном, чтобы он покрыл рис примерно на 0,5 см.","Выложить сверху на рис курицу и полить маринадом.","Запекать в духовке, разогретой до 180С, около 50 минут. За это время несколько раз смазать поверхность курицы жидкостью из формы. Если она слишком быстро впитается в рис, можно долить немного бульона.","Проверить готовность: курица должна стать поджаристой, при прокалывании выделяется прозрачный сок. Рис сверху только сверху кажется подсохшим, на самом деле, он мягкий, пропитанный бульоном и пряностями, каждая рисинка отдельно.","Подавать горячим.Приятного аппетита!","361.16"};


    public int[] LNH_I_8 = {R.drawable.l_8,R.drawable.l_r8_st1,R.drawable.l_r8_st2,
            R.drawable.l_r8_st3,R.drawable.l_r8_st4,R.drawable.l_r8_st5,R.drawable.l_r8_st6,};
    public String[] LNH_T_8 = {"Макароны с фаршем на сковороде","Фарш мясной - 400 гр\nМакароны - 300 гр\nЛук - 80 гр\nМорковь - 80 гр\nРастительное масло для жарки - 24 мл\nВода - 300 мл\nСоль - по вкусу\nСпеции сухие - по вкусу","Как быстро сделать макароны с фаршем на сковороде? Для приготовления этого блюда очень удобно использовать сковороду с антипригарным покрытием. Нагрейте сковороду до горячего состояния и налейте совсем немного растительного масла. Затем выложите на горячую сковороду мясной фарш и разомните его деревянной лопаткой. Обжарьте фарш в течении 5-7 минут.","Пока фарш жарится очистите лук и морковь от кожуры. Промойте их в проточной воде и измельчите - лук мелко нарежьте острым ножом, а морковь натрите на крупной или средней терке.","Измельченные лук и морковь добавьте в сковороду к обжаренному фаршу. Обжаривайте все вместе еще 2-3 минуты.","Отмерьте необходимое количество макарон.","Затем всыпьте в сковороду подготовленные макароны и добавьте горячей воды. По своему вкусу добавьте немного соли и специи. Перемешайте и доведите до кипения. Затем накройте крышкой и сделайте огонь меньше. Тушите все вместе минут 12-15 до готовности макарон. Если вся вода испарится, а макароны будут сыроваты, то можно добавить еще совсем немного горячей воды, чтобы дать им дойти.","Готовые макароны с фаршем перемешайте и разложите по тарелкам. Приятного аппетита!","263.13"};


    public int[] LNH_I_9 = {R.drawable.l_9,R.drawable.l_r9_st1,R.drawable.l_r9_st2,
            R.drawable.l_r9_st3,R.drawable.l_r9_st4,R.drawable.l_r9_st5,R.drawable.l_r9_st6,R.drawable.l_r9_st7,R.drawable.l_r9_st8,R.drawable.l_r9_st9,R.drawable.l_r9_st10,R.drawable.l_r9_st11};
    public String[] LNH_T_9 = {"Овощное рагу в духовке","Помидоры - 200 гр\nБаклажаны - 200 гр\nКабачки - 300 гр\nБолгарский перец - 100 гр\nЛук - 80 гр\nЧеснок - 15 гр\nРастительное масло - 40 мл\nЧесночный порошок щепотка - 2 гр\nПерец черный молотый - по вкусу\nСоль - по вкусу","Как сделать овощное рагу в духовке? Для начала подготовьте все необходимые ингредиенты по списку. Все овощи вымойте, обсушите. Специи могут быть любые по вашему вкусу.","У баклажана срежьте хвостик, овощ нарежьте средними кубиками. Как убрать горечь из баклажанов? Посолите и оставьте примерно на 10 минут, пока не пустят сок. Образовавшуюся жидкость слейте, баклажаны промойте и приступайте к приготовлению. Учтите, что молодые овощи обычно не горчат, а также некоторые особые их сорта.","Кабачок нарежьте такими же кубиками, как и баклажан. Какие кабачки подойдут лучше всего? Выбирайте молодые плоды с нежной кожицей. Помойте их и очистите от кожуры. Совсем тоненькую кожицу срезать не обязательно. Если используете более зрелые кабачки, срежьте грубую кожуру и вырежьте серединку с семенами.","Морковь очистите и нарежьте кружочками.","Помидоры нарежьте дольками. Помидоры выбирайте сочные, но плотные. Мягкие плоды плохо держат форму, в процессе нарезки и приготовления они расползутся в бесформенную массу и испортят внешний вид блюда.","Болгарский перец очистите от семян и нарежьте средними кусочками.","Луковицу нарежьте полукольцами, предварительно очистив от шелухи.","Чеснок мелко порубите.","В миске соедините все нарезанные овощи и чеснок. Посыпьте солью и перцем и аккуратно перемешайте.","Переложите овощи в смазанную растительным маслом форму для запекания. Сверху посыпьте сухим чесноком и полейте 1 ст. л. растительного масла. Поставьте форму в разогретую до 180°С духовку примерно на 25-30 минут. Точное время зависит от вашей духовки и от размера нарезанных овощей. При желании можете накрыть форму фольгой, так овощи будут готовы быстрее и получатся более сочными.","Приятного аппетита!","236.54"};


    public int[] LNH_I_10 = {R.drawable.l_10,R.drawable.l_r10_st1,R.drawable.l_r10_st2,
            R.drawable.l_r10_st3,R.drawable.l_r10_st4,R.drawable.l_r10_st5,R.drawable.l_r10_st6,R.drawable.l_r10_st7,R.drawable.l_r10_st8,R.drawable.l_r10_st9,R.drawable.l_r10_st10,R.drawable.l_r10_st11};
    public String[] LNH_T_10 = {"Свинина запеченная с картошкой в духовке","Свинина - 500 гр\nКартошка - 400 гр\nЛук можно использовать фиолетовый - 1 шт.\nМука - 13 гр\nКуркума - 2.5 гр\nПаприка - 2.5 гр\nРастительное масло - 35 мл\nСливки - 150 мл\nСоль - по вкусу\nСпеции сухие - по вкусу","Как запечь свинину с картошкой в духовке? Подготовьте для этого необходимые ингредиенты. Мясо свинины выбирайте без костей. Картофель удобно брать помельче, чтобы просто нарезать напополам. Лук и буду использовать фиолетовый. Но можно взять и обычный репчатый. Сливки можно использовать любой жирности. Чем они жирнее, тем более сливочный будет вкус у готового блюда.","Мясо свинины нарежьте крупными кусочками. Затем посыпьте солью и специями.","Каждый кусочек обваляйте в муке.","На горячую сковороду налейте немного растительного масла и выложите все кусочки мяса, обвалянные в муке. Обжарьте их на большом огне до золотистой корочки.","Лук очистите и нарежьте полукольцами.","Картофель очистите от кожуры. Молодой картофель еще не успел обзавестись толстой кожурой, поэтому его можно просто потереть металлической щеткой или ножом. Нарежьте картофель крупными кусочками и, так же, как и мясо, обжарьте на сильном огне несколько минут до золотистой корочки. Посыпьте картофель куркумой, паприкой и солью.","Перемешайте мясо с картофелем и луком, а затем выложите все в форму для запекания.","Залейте все сливками.","Накройте форму листом фольги и поставьте в духовку, предварительно разогретую до 180 градусов, на 40-45 минут. При запекании ориентируйтесь по своей духовке.","Минут за 10 до конца запекания лист фольги можно снять, чтобы блюдо немного подсушилось. Картофель с мясом стали очень аппетитного золотистого цвета. извлеките форму из духовки и подавайте к столу в горячем виде.","Приятного аппетита!","199.82"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_all_recipes);
        init();
        Selector = (String) getIntent().getExtras().get("l_recipe");
        if (Selector.equals("l_1")){
            LNH_recipe_1();
        }else if (Selector.equals("l_2")){
            LNH_recipe_2();
        }else if (Selector.equals("l_3")){
            LNH_recipe_3();
        }else if (Selector.equals("l_4")){
            LNH_recipe_4();
        }else if (Selector.equals("l_5")){
            LNH_recipe_5();
        }else if (Selector.equals("l_6")){
            LNH_recipe_6();
        }else if (Selector.equals("l_7")){
            LNH_recipe_7();
        }else if (Selector.equals("l_8")){
            LNH_recipe_8();
        }else if (Selector.equals("l_9")){
            LNH_recipe_9();
        }else if (Selector.equals("l_10")){
            LNH_recipe_10();
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
    public void LNH_recipe_1(){
        Recipe_name.setText(LNH_T_1[0]);
        ingredients.setText(LNH_T_1[1]);
        t_step1.setText(LNH_T_1[2]);
        t_step2.setText(LNH_T_1[3]);
        t_step3.setText(LNH_T_1[4]);
        t_step4.setText(LNH_T_1[5]);
        t_step5.setText(LNH_T_1[6]);
        t_step6.setText(LNH_T_1[7]);
        t_step7.setText(LNH_T_1[8]);
        t_step8.setText(LNH_T_1[9]);
        t_step9.setText(LNH_T_1[10]);
        t_step10.setText(LNH_T_1[11]);
        t_step11.setText(LNH_T_1[12]);
        t_step12.setText(LNH_T_1[13]);
        t_step13.setText(LNH_T_1[14]);
        t_step14.setText(LNH_T_1[15]);
        coast.setText("Стоимость: " + LNH_T_1[16] + " руб");
        main_image.setImageResource(LNH_I_1[0]);
        i_step1.setImageResource(LNH_I_1[1]);
        i_step2.setImageResource(LNH_I_1[2]);
        i_step3.setImageResource(LNH_I_1[3]);
        i_step4.setImageResource(LNH_I_1[4]);
        i_step5.setImageResource(LNH_I_1[5]);
        i_step6.setImageResource(LNH_I_1[6]);
        i_step7.setImageResource(LNH_I_1[7]);
        i_step8.setImageResource(LNH_I_1[8]);
        i_step9.setImageResource(LNH_I_1[9]);
        i_step10.setImageResource(LNH_I_1[10]);
        i_step11.setImageResource(LNH_I_1[11]);
        i_step12.setImageResource(LNH_I_1[12]);
        i_step13.setImageResource(LNH_I_1[13]);
        i_step14.setImageResource(LNH_I_1[14]);
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
        yValues.add(new PieEntry(29f,"Жиры"));
        yValues.add(new PieEntry(57f,"Углеводы"));
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
    public void LNH_recipe_2(){
        Recipe_name.setText(LNH_T_2[0]);
        ingredients.setText(LNH_T_2[1]);
        t_step1.setText(LNH_T_2[2]);
        t_step2.setText(LNH_T_2[3]);
        t_step3.setText(LNH_T_2[4]);
        t_step4.setText(LNH_T_2[5]);
        t_step5.setText(LNH_T_2[6]);
        t_step6.setText(LNH_T_2[7]);
        t_step7.setText(LNH_T_2[8]);
        t_step8.setText(LNH_T_2[9]);
        t_step9.setText(LNH_T_2[10]);
        t_step10.setText(LNH_T_2[11]);
        t_step11.setText(LNH_T_2[12]);
        t_step12.setText(LNH_T_2[13]);
        t_step13.setText(LNH_T_2[14]);
        t_step14.setText(LNH_T_2[15]);
        t_step15.setText(LNH_T_2[16]);
        t_step16.setText(LNH_T_2[17]);
        t_step17.setText(LNH_T_2[18]);
        t_step18.setText(LNH_T_2[19]);
        coast.setText("Стоимость: " + LNH_T_2[20] + " руб");
        main_image.setImageResource(LNH_I_2[0]);
        i_step1.setImageResource(LNH_I_2[1]);
        i_step2.setImageResource(LNH_I_2[2]);
        i_step3.setImageResource(LNH_I_2[3]);
        i_step4.setImageResource(LNH_I_2[4]);
        i_step5.setImageResource(LNH_I_2[5]);
        i_step6.setImageResource(LNH_I_2[6]);
        i_step7.setImageResource(LNH_I_2[7]);
        i_step8.setImageResource(LNH_I_2[8]);
        i_step9.setImageResource(LNH_I_2[9]);
        i_step10.setImageResource(LNH_I_2[10]);
        i_step11.setImageResource(LNH_I_2[11]);
        i_step12.setImageResource(LNH_I_2[12]);
        i_step13.setImageResource(LNH_I_2[13]);
        i_step14.setImageResource(LNH_I_2[14]);
        i_step15.setImageResource(LNH_I_2[15]);
        i_step16.setImageResource(LNH_I_2[16]);
        i_step17.setImageResource(LNH_I_2[17]);
        i_step18.setImageResource(LNH_I_2[18]);
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
        yValues.add(new PieEntry(44f,"Белки"));
        yValues.add(new PieEntry(34f,"Жиры"));
        yValues.add(new PieEntry(32f,"Углеводы"));
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
    public void LNH_recipe_3(){
        Recipe_name.setText(LNH_T_3[0]);
        ingredients.setText(LNH_T_3[1]);
        t_step1.setText(LNH_T_3[2]);
        t_step2.setText(LNH_T_3[3]);
        t_step3.setText(LNH_T_3[4]);
        t_step4.setText(LNH_T_3[5]);
        t_step5.setText(LNH_T_3[6]);
        t_step6.setText(LNH_T_3[7]);
        t_step7.setText(LNH_T_3[8]);
        t_step8.setText(LNH_T_3[9]);
        t_step9.setText(LNH_T_3[10]);
        t_step10.setText(LNH_T_3[11]);
        t_step11.setText(LNH_T_3[12]);
        t_step12.setText(LNH_T_3[13]);
        coast.setText("Стоимость: " + LNH_T_3[14] + " руб");
        main_image.setImageResource(LNH_I_3[0]);
        i_step1.setImageResource(LNH_I_3[1]);
        i_step2.setImageResource(LNH_I_3[2]);
        i_step3.setImageResource(LNH_I_3[3]);
        i_step4.setImageResource(LNH_I_3[4]);
        i_step5.setImageResource(LNH_I_3[5]);
        i_step6.setImageResource(LNH_I_3[6]);
        i_step7.setImageResource(LNH_I_3[7]);
        i_step8.setImageResource(LNH_I_3[8]);
        i_step9.setImageResource(LNH_I_3[9]);
        i_step10.setImageResource(LNH_I_3[10]);
        i_step11.setImageResource(LNH_I_3[11]);
        i_step12.setImageResource(LNH_I_3[12]);
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
        yValues.add(new PieEntry(38f,"Белки"));
        yValues.add(new PieEntry(41f,"Жиры"));
        yValues.add(new PieEntry(21f,"Углеводы"));
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
    public void LNH_recipe_4(){
        Recipe_name.setText(LNH_T_4[0]);
        ingredients.setText(LNH_T_4[1]);
        t_step1.setText(LNH_T_4[2]);
        t_step2.setText(LNH_T_4[3]);
        t_step3.setText(LNH_T_4[4]);
        t_step4.setText(LNH_T_4[5]);
        t_step5.setText(LNH_T_4[6]);
        t_step6.setText(LNH_T_4[7]);
        t_step7.setText(LNH_T_4[8]);
        t_step8.setText(LNH_T_4[9]);
        t_step9.setText(LNH_T_4[10]);
        t_step10.setText(LNH_T_4[11]);
        t_step11.setText(LNH_T_4[12]);
        t_step12.setText(LNH_T_4[13]);
        t_step13.setText(LNH_T_4[14]);
        t_step14.setText(LNH_T_4[15]);
        t_step15.setText(LNH_T_4[16]);
        t_step16.setText(LNH_T_4[17]);
        t_step17.setText(LNH_T_4[18]);
        t_step18.setText(LNH_T_4[19]);
        t_step19.setText(LNH_T_4[20]);
        t_step20.setText(LNH_T_4[21]);
        coast.setText("Стоимость: " + LNH_T_4[22] + " руб");
        main_image.setImageResource(LNH_I_4[0]);
        i_step1.setImageResource(LNH_I_4[1]);
        i_step2.setImageResource(LNH_I_4[2]);
        i_step3.setImageResource(LNH_I_4[3]);
        i_step4.setImageResource(LNH_I_4[4]);
        i_step5.setImageResource(LNH_I_4[5]);
        i_step6.setImageResource(LNH_I_4[6]);
        i_step7.setImageResource(LNH_I_4[7]);
        i_step8.setImageResource(LNH_I_4[8]);
        i_step9.setImageResource(LNH_I_4[9]);
        i_step10.setImageResource(LNH_I_4[10]);
        i_step11.setImageResource(LNH_I_4[11]);
        i_step12.setImageResource(LNH_I_4[12]);
        i_step13.setImageResource(LNH_I_4[13]);
        i_step14.setImageResource(LNH_I_4[14]);
        i_step15.setImageResource(LNH_I_4[15]);
        i_step16.setImageResource(LNH_I_4[16]);
        i_step17.setImageResource(LNH_I_4[17]);
        i_step18.setImageResource(LNH_I_4[18]);
        i_step19.setImageResource(LNH_I_4[19]);
        i_step20.setImageResource(LNH_I_4[20]);
        pieChart = (PieChart) findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(0);
        pieChart.setTransparentCircleRadius(61f);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(19f,"Белки"));
        yValues.add(new PieEntry(48f,"Жиры"));
        yValues.add(new PieEntry(33f,"Углеводы"));
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
    public void LNH_recipe_5(){
        Recipe_name.setText(LNH_T_5[0]);
        ingredients.setText(LNH_T_5[1]);
        t_step1.setText(LNH_T_5[2]);
        t_step2.setText(LNH_T_5[3]);
        t_step3.setText(LNH_T_5[4]);
        t_step4.setText(LNH_T_5[5]);
        t_step5.setText(LNH_T_5[6]);
        t_step6.setText(LNH_T_5[7]);
        t_step7.setText(LNH_T_5[8]);
        t_step8.setText(LNH_T_5[9]);
        t_step9.setText(LNH_T_5[10]);
        t_step10.setText(LNH_T_5[11]);
        t_step11.setText(LNH_T_5[12]);
        coast.setText("Стоимость: " + LNH_T_5[13] + " руб");
        main_image.setImageResource(LNH_I_5[0]);
        i_step1.setImageResource(LNH_I_5[1]);
        i_step2.setImageResource(LNH_I_5[2]);
        i_step3.setImageResource(LNH_I_5[3]);
        i_step4.setImageResource(LNH_I_5[4]);
        i_step5.setImageResource(LNH_I_5[5]);
        i_step6.setImageResource(LNH_I_5[6]);
        i_step7.setImageResource(LNH_I_5[7]);
        i_step8.setImageResource(LNH_I_5[8]);
        i_step9.setImageResource(LNH_I_5[9]);
        i_step10.setImageResource(LNH_I_5[10]);
        i_step11.setImageResource(LNH_I_5[11]);
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
        yValues.add(new PieEntry(30f,"Белки"));
        yValues.add(new PieEntry(30f,"Жиры"));
        yValues.add(new PieEntry(40f,"Углеводы"));
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
    public void LNH_recipe_6(){
        Recipe_name.setText(LNH_T_6[0]);
        ingredients.setText(LNH_T_6[1]);
        t_step1.setText(LNH_T_6[2]);
        t_step2.setText(LNH_T_6[3]);
        t_step3.setText(LNH_T_6[4]);
        t_step4.setText(LNH_T_6[5]);
        t_step5.setText(LNH_T_6[6]);
        t_step6.setText(LNH_T_6[7]);
        t_step7.setText(LNH_T_6[8]);
        t_step8.setText(LNH_T_6[9]);
        t_step9.setText(LNH_T_6[10]);
        t_step10.setText(LNH_T_6[11]);
        t_step11.setText(LNH_T_6[12]);
        t_step12.setText(LNH_T_6[13]);
        t_step13.setText(LNH_T_6[14]);
        t_step14.setText(LNH_T_6[15]);
        coast.setText("Стоимость: " + LNH_T_6[16] + " руб");
        main_image.setImageResource(LNH_I_6[0]);
        i_step1.setImageResource(LNH_I_6[1]);
        i_step2.setImageResource(LNH_I_6[2]);
        i_step3.setImageResource(LNH_I_6[3]);
        i_step4.setImageResource(LNH_I_6[4]);
        i_step5.setImageResource(LNH_I_6[5]);
        i_step6.setImageResource(LNH_I_6[6]);
        i_step7.setImageResource(LNH_I_6[7]);
        i_step8.setImageResource(LNH_I_6[8]);
        i_step9.setImageResource(LNH_I_6[9]);
        i_step10.setImageResource(LNH_I_6[10]);
        i_step11.setImageResource(LNH_I_6[11]);
        i_step12.setImageResource(LNH_I_6[12]);
        i_step13.setImageResource(LNH_I_6[13]);
        i_step14.setImageResource(LNH_I_6[14]);
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
        yValues.add(new PieEntry(29f,"Жиры"));
        yValues.add(new PieEntry(57f,"Углеводы"));
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
    public void LNH_recipe_7(){
        Recipe_name.setText(LNH_T_7[0]);
        ingredients.setText(LNH_T_7[1]);
        t_step1.setText(LNH_T_7[2]);
        t_step2.setText(LNH_T_7[3]);
        t_step3.setText(LNH_T_7[4]);
        t_step4.setText(LNH_T_7[5]);
        t_step5.setText(LNH_T_7[6]);
        t_step6.setText(LNH_T_7[7]);
        t_step7.setText(LNH_T_7[8]);
        t_step8.setText(LNH_T_7[9]);
        t_step9.setText(LNH_T_7[10]);
        t_step10.setText(LNH_T_7[11]);
        t_step11.setText(LNH_T_7[12]);
        coast.setText("Стоимость: " + LNH_T_7[14] + " руб");
        main_image.setImageResource(LNH_I_7[0]);
        i_step1.setImageResource(LNH_I_7[1]);
        i_step2.setImageResource(LNH_I_7[2]);
        i_step3.setImageResource(LNH_I_7[3]);
        i_step4.setImageResource(LNH_I_7[4]);
        i_step5.setImageResource(LNH_I_7[5]);
        i_step6.setImageResource(LNH_I_7[6]);
        i_step7.setImageResource(LNH_I_7[7]);
        i_step8.setImageResource(LNH_I_7[8]);
        i_step9.setImageResource(LNH_I_7[9]);
        i_step10.setImageResource(LNH_I_7[10]);
        i_step11.setImageResource(LNH_I_7[11]);
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
        yValues.add(new PieEntry(22f,"Белки"));
        yValues.add(new PieEntry(12f,"Жиры"));
        yValues.add(new PieEntry(66f,"Углеводы"));
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
    public void LNH_recipe_8(){
        Recipe_name.setText(LNH_T_8[0]);
        ingredients.setText(LNH_T_8[1]);
        t_step1.setText(LNH_T_8[2]);
        t_step2.setText(LNH_T_8[3]);
        t_step3.setText(LNH_T_8[4]);
        t_step4.setText(LNH_T_8[5]);
        t_step5.setText(LNH_T_8[6]);
        t_step6.setText(LNH_T_8[7]);
        coast.setText("Стоимость: " + LNH_T_8[8] + " руб");
        main_image.setImageResource(LNH_I_8[0]);
        i_step1.setImageResource(LNH_I_8[1]);
        i_step2.setImageResource(LNH_I_8[2]);
        i_step3.setImageResource(LNH_I_8[3]);
        i_step4.setImageResource(LNH_I_8[4]);
        i_step5.setImageResource(LNH_I_8[5]);
        i_step6.setImageResource(LNH_I_8[6]);
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
        yValues.add(new PieEntry(18f,"Белки"));
        yValues.add(new PieEntry(33f,"Жиры"));
        yValues.add(new PieEntry(49f,"Углеводы"));
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
    public void LNH_recipe_9(){
        Recipe_name.setText(LNH_T_9[0]);
        ingredients.setText(LNH_T_9[1]);
        t_step1.setText(LNH_T_9[2]);
        t_step2.setText(LNH_T_9[3]);
        t_step3.setText(LNH_T_9[4]);
        t_step4.setText(LNH_T_9[5]);
        t_step5.setText(LNH_T_9[6]);
        t_step6.setText(LNH_T_9[7]);
        t_step7.setText(LNH_T_9[8]);
        t_step8.setText(LNH_T_9[9]);
        t_step9.setText(LNH_T_9[10]);
        t_step10.setText(LNH_T_9[11]);
        t_step11.setText(LNH_T_9[12]);
        coast.setText("Стоимость: " + LNH_T_9[13] + " руб");
        main_image.setImageResource(LNH_I_9[0]);
        i_step1.setImageResource(LNH_I_9[1]);
        i_step2.setImageResource(LNH_I_9[2]);
        i_step3.setImageResource(LNH_I_9[3]);
        i_step4.setImageResource(LNH_I_9[4]);
        i_step5.setImageResource(LNH_I_9[5]);
        i_step6.setImageResource(LNH_I_9[6]);
        i_step7.setImageResource(LNH_I_9[7]);
        i_step8.setImageResource(LNH_I_9[8]);
        i_step9.setImageResource(LNH_I_9[9]);
        i_step10.setImageResource(LNH_I_9[10]);
        i_step11.setImageResource(LNH_I_9[11]);
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
        yValues.add(new PieEntry(9f,"Белки"));
        yValues.add(new PieEntry(36f,"Жиры"));
        yValues.add(new PieEntry(55f,"Углеводы"));
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
    public void LNH_recipe_10(){
        Recipe_name.setText(LNH_T_10[0]);
        ingredients.setText(LNH_T_10[1]);
        t_step1.setText(LNH_T_10[2]);
        t_step2.setText(LNH_T_10[3]);
        t_step3.setText(LNH_T_10[4]);
        t_step4.setText(LNH_T_10[5]);
        t_step5.setText(LNH_T_10[6]);
        t_step6.setText(LNH_T_10[7]);
        t_step7.setText(LNH_T_10[8]);
        t_step8.setText(LNH_T_10[9]);
        t_step9.setText(LNH_T_10[10]);
        t_step10.setText(LNH_T_10[11]);
        t_step11.setText(LNH_T_10[12]);
        coast.setText("Стоимость: " + LNH_T_10[13] + " руб");
        main_image.setImageResource(LNH_I_10[0]);
        i_step1.setImageResource(LNH_I_10[1]);
        i_step2.setImageResource(LNH_I_10[2]);
        i_step3.setImageResource(LNH_I_10[3]);
        i_step4.setImageResource(LNH_I_10[4]);
        i_step5.setImageResource(LNH_I_10[5]);
        i_step6.setImageResource(LNH_I_10[6]);
        i_step7.setImageResource(LNH_I_10[7]);
        i_step8.setImageResource(LNH_I_10[8]);
        i_step9.setImageResource(LNH_I_10[9]);
        i_step10.setImageResource(LNH_I_10[10]);
        i_step11.setImageResource(LNH_I_10[11]);
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
        yValues.add(new PieEntry(26f,"Белки"));
        yValues.add(new PieEntry(48f,"Жиры"));
        yValues.add(new PieEntry(26f,"Углеводы"));
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