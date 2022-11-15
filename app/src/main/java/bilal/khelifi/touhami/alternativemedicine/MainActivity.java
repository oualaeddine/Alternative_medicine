package bilal.khelifi.touhami.alternativemedicine;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import bilal.khelifi.touhami.alternativemedicine.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);

        List<MyListItem> itemList = new ArrayList<>();

        itemList.add(new MyListItem("طب الوخز بالإبر", "يعتبر العلاج بالإبر أحد تقنيات الطب الصيني المستخدمة منذ أكثر من 2000 عام، وتعمل على تحفيز اماكن محددة من الجسم ويسمى الشخص الذي يقوم بهذا العلاج طبيب الوخز بالإبر (بالإنجليزية: Acupuncturist)، حيث يقوم بتعقيم إبرة رقيقة، ليتم وضعها في جلد المريض بأماكن محددة للمساعدة في عملية شفاء الجسم، وأثبتت بعض الدراسات أن الوخز بالإبر يمكن أن يكون مفيداً في عديد من الحالات المرضية مثل:\n" +
                "آلام الرقبة والظهر.\n" +
                " الغثيان.\n" +
                "الاكتئاب والأرق.\n" +
                "القلق والتوتر.\n",
                R.drawable.needles
        ));
        itemList.add(new MyListItem("طب العلاج بالحجامة", "الحجامة (بالإنجليزية: Cupping)، لقد انتشر استخدامها من قبل الرياضيين في هذه الأيام، حيث تعمل على تقليل الألم، والالتهابات، وزيادة تدفق الدم، والاسترخاء، عن طريق استخدام الكؤوس للشفط إما من خلال الحرارة أو من خلال المضخات الآلية على سطح الجلد، ويجدر الإشارة أن الحجامة يمكن أن يكون لها بعض الآثار الجانبية نذكر منها:\n" +
                "الإصابة بالكدمات.\n" +
                "التعرض للحروق.\n" +
                "التهابات الجلد.\n",
                R.drawable.cupping
        ));
        itemList.add(new MyListItem("طب العلاج بالطاقة", "هناك العديد من الطرق المستخدمة في العلاج بالطاقة، وهنا نذكر بعض هذه المجالات الرئيسة:\n" +
                "\n" +
                "العلاج بالمجال المغناطيسي: يستخدم المجال المغناطيسي أو الكهرباء لعلاج عدد من مشاكل العظام والعضلات، حيث أن هذا النوع من العلاج قد يساعد في علاج الكسور بشكل أسرع وقد يكون مفيداً في علاج مشاكلالعظام والتهاب المفاصل، ولكن تجدر الإشارة إلى أن العلاج بالمجال المغناطيسي قد لا يكون مناسباً في حالات الحمل، أو إذا كان المريض يملك جهاز قلب مزروع، أو مضخة أنسولين.\n" +
                "الريكي (بالإنجليزية: Reiki)، يعتقد أن هذا النوع من العلاج يعمل على استغلال طاقة الجسم الطبيعة لتسريع الشفاء، حيث يرفع المعالج يده على جسم المريض بطريقة معينة لتوجيه الطاقة من خلال يده إلى جسم المريض لتعزيز التعافي\n",
                R.drawable.energy
        ));
        itemList.add(new MyListItem("طب تقويم العمود الفقري", "يعرف طب تقويم العمود الفقري (بالإنجليزية: Chiropractic Medicine)، بقدرته على تقليل الألم وتحسين وظائف الجسم، ومساعدة الجسم على الشفاء بشكل طبيعي عن طريق تقنيات مختلفة يقوم بها الأخصائي لضبط العمود الفقري وأجزاء أخرى من جسم المريض.\n" +
                "\n" +
                " كما كشفت بعض الدراسات أن العلاج بتقويم العمود الفقري ليس مفيداً فقط في تخفيف آلام الظهر بل ويمكن أن يساعد أيضاً في بعض الأمراض الأخرى، نذكر منها:\n" +
                "\n" +
                "الصداع وآلام الرقبة.\n" +
                "مشاكل المفاصل.\n" +
                "الاضطرابات الناجمة عن الإصابة\n",
                R.drawable.bones
        ));
      /*  itemList.add(new MyListItem("طب العلاج عن طريق اللمس", "يتساءل البعض عن ما هو الطب البديل عن طريق اللمس، وهو أحد طرق العلاج البديل التي تظهر التجارب أنه يمكن أن يقلل من القلق لدى الأشخاص المصابين بالسرطان، حيث يستخدم المعالج طاقته لتحديد وإصلاح الاختلالات في مجال الطاقة للمريض، ولكن من غير المعروف إذا كان هذا النوع من العلاج يمكن أن يستخدم في مجالات أخرى.",
                "touch"
        ));*/
        itemList.add(new MyListItem("الطب البديل بالأعشاب", "حيث تستخدم أجزاء النباتات في العلاج، ووفقاً لمنظمة الصحة العالمية فإن 80% من الناس في جميع أنحاء العالم يستخدمون العلاجات العشبية، ووجدت بعض الدراسات أن الأعشاب قد نجحت في علاج بعض المشاكل الصحية مثل الحساسية ومتلازمة ما قبل الحيض (بالإنجليزية: Premenstrual Syndrome)، والتعب المزمن",
                R.drawable.herbs
        ));
        itemList.add(new MyListItem("طب العلاج بالايورفيدا", "لم يكن هناك الكثير من الدراسات والأبحاث لدعم الايورفيدا والتي تعد من أقدم النظم الطبية في العالم، ويعتمد استخدامها على الأعشاب، والوجبات الغذائية الخاصة، والممارسات الفريدة لعلاج الأمراض، ولكن وجدت بعض الأبحاث أن الايورفيدا قد تكون خطيرة لاحتوائها على بعض المعادن السامة.",
                R.drawable.aerofi
        ));
        itemList.add(new MyListItem("طب العلاج باليوغا", "تستخدم اليوغا كعلاج للجسم والعقل، وتعمل على تقليل الإجهاد، والحد من فرط التوتر، واستعادة تدفق الطاقة عبر خطوط الطول، وتعتبر اليوغا من الممارسات الآمنة التي لا تحتوي الكثير من المخاطر وتستخدم على نطاق واسع حول العالم.",
                R.drawable.yoga
        ));

        RecAdapter adapter = new RecAdapter(itemList);

        RecyclerView recyclerView = findViewById(R.id.recview);

        ((SimpleItemAnimator) Objects.requireNonNull(recyclerView.getItemAnimator())).setSupportsChangeAnimations(false);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }
}