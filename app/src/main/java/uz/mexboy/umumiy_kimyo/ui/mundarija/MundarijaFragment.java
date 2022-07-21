package uz.mexboy.umumiy_kimyo.ui.mundarija;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
;
import uz.mexboy.umumiy_kimyo.MainActivity;
import uz.mexboy.umumiy_kimyo.R;
import uz.mexboy.umumiy_kimyo.adapter.MundarijaAdapter;
import uz.mexboy.umumiy_kimyo.model.MundarijaModel;
import uz.mexboy.umumiy_kimyo.ui.home.HomeFragment;

public class MundarijaFragment extends Fragment implements MundarijaAdapter.ItemClickListener {
    private Context mContext;
    private View root;
    private List<MundarijaModel> data;

    private RecyclerView recyclerView;

    private MundarijaAdapter mundarijaAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_mundarija, container, false);

        init();
        return root;
    }

    private void init() {
        data = new ArrayList<>();
        data.add(new MundarijaModel("Bosh sahifa", 0));
        data.add(new MundarijaModel("Atom-molеkulyar ta'limot", 2));
        data.add(new MundarijaModel("Kimyoning asosi tushuncha va qonunlari", 4));
        data.add(new MundarijaModel("Moddaning tuzilishi. Atom tuzilishi va elementlar sistemasi", 8));
        data.add(new MundarijaModel("Atomning xossalari. Elektromanfiylik", 26));
        data.add(new MundarijaModel("Kimyoviy bog‘lanish va uning turlari", 28));
        data.add(new MundarijaModel("Kimyoviy jarayonlarning umumiy qonunlari. Kimyoviy kinеtika", 33));
        data.add(new MundarijaModel("Kimyoviy muvozanat. Kataliz", 36));
        data.add(new MundarijaModel("Eritmalar. Eruvchanlik. Eritmalarning konsentratsiyalarini ifodalash usullari. Dispеrs sistеmalar", 41));
        data.add(new MundarijaModel("Elektrolitik dissotsiyalanish", 46));
        data.add(new MundarijaModel("Tuzlarning gidrolizlanishi. Gidrolizlanish darajasi va konstantasi", 48));
        data.add(new MundarijaModel("Oksidlanish va qaytarilish jarayonlari", 51));
        data.add(new MundarijaModel("Oksidlanish-qaytarilish reaksiyalarini tеnglamalarini tuzish", 57));
        data.add(new MundarijaModel("Analitik kimyo fani", 61));
        data.add(new MundarijaModel("Analitik kimyo fani rivojlanishining qisqacha tarixi", 62));
        data.add(new MundarijaModel("Kimyoviy muvozanatning asosiy turlari", 65));
        data.add(new MundarijaModel("Kislota-asosli reaksiyalar. Suvli eritmalarda kislota va asoslarning elektrolitik dissotsiatsiyasi. Kislota va asoslar haqidagi hozirgi zamon tushunchalari", 70));
        data.add(new MundarijaModel("Tuz eritmalarida kislota-asos muvozanat", 77));
        data.add(new MundarijaModel("Analiz uchun o‗rtacha namunani olish", 85));
        data.add(new MundarijaModel("Analiz ob‘ektlarida namlikni aniqlash", 87));
        data.add(new MundarijaModel("Miqdoriy analizning shakklanishi", 87));
        data.add(new MundarijaModel("Kompleks hosil qilish reaksiyalari", 91));
        data.add(new MundarijaModel("Kompleksonlarning analizda qo‘llanishi", 91));
        data.add(new MundarijaModel("Bevosita va bilvosita titrlash metodlari", 93));
        data.add(new MundarijaModel("Titrlash egrilarini hisoblash", 94));
        data.add(new MundarijaModel("Fizik-kimyoviy metodlarning mohiyati", 97));
        data.add(new MundarijaModel("Organik reaksiyalarning sinflanishi", 100));
        data.add(new MundarijaModel("Uglevodorodlar. Alkanlar", 102));
        data.add(new MundarijaModel("Alkanlarning faol erkin ralikallar bilan boradigan vodorod atomlarining almashinish reaksiyalari", 112));
        data.add(new MundarijaModel("Alkenlar", 120));
        data.add(new MundarijaModel("Alkinlar", 136));
        data.add(new MundarijaModel("Alkadienlar", 147));
        data.add(new MundarijaModel("Arenlar (Aromatik uglevodorodlar)", 152));
        data.add(new MundarijaModel("Kondensirlangan xalqali politsiklik arenlar", 172));
        data.add(new MundarijaModel("Perkondensirlangan politsiklik arenlar", 178));
        data.add(new MundarijaModel("Galogenarenlar", 180));
        data.add(new MundarijaModel("Spirtlar", 187));
        data.add(new MundarijaModel("Fenollar", 209));
        data.add(new MundarijaModel("Aldegid va ketonlar", 226));
        data.add(new MundarijaModel("To‗yingan monokarbon kislotalar", 241));
        data.add(new MundarijaModel("To‗yinmagan karbon kislotalar", 255));
        data.add(new MundarijaModel("Gidroksikislotalar", 271));
        data.add(new MundarijaModel("Aminobirikmalar", 294));
        data.add(new MundarijaModel("Kimyoviy tеrmodinamika", 311));
        data.add(new MundarijaModel("Entropiya (energiyaning degradatsiyasi)", 330));
        data.add(new MundarijaModel("Gibbs va Gelmgols energiyalari va fugitivlik. (izotermik potensiallar)", 339));
        data.add(new MundarijaModel("Elektrokimyo, Elektrolitlarning eritmalari", 350));
        data.add(new MundarijaModel("Elektrod potensiallarining hosil bo‗lishi", 360));
        data.add(new MundarijaModel("Kimyoviy galvanik elementlar", 364));
        data.add(new MundarijaModel("Galvanik elementlar yordamida fizik kimyoviy konstantalarini o‗lchash", 368));
        data.add(new MundarijaModel("Elektroliz", 373));
        data.add(new MundarijaModel("Kolloid kimyo zamonaviy kimyoning nazariy asosi", 380));
        data.add(new MundarijaModel("Dispers sistemalar", 385));
        data.add(new MundarijaModel("Kolloid sistemalarning klassifikatsiyasi", 394));
        data.add(new MundarijaModel("Kolloidlarning olinish usullari", 399));
        data.add(new MundarijaModel("Kolloid eritmalarning molekulyar-kinetik xossalari", 406));
        data.add(new MundarijaModel("Kolloidlarning optik xossalari", 417));
        data.add(new MundarijaModel("Dispers sistemalarning sirt hodisalari", 424));
        data.add(new MundarijaModel("Adsorbtsiya", 429));
        data.add(new MundarijaModel("Kolloid sistemalarning elektr xossalari", 440));
        data.add(new MundarijaModel("Molekulyar massani eritmaning osmotik bosimi orqali aniqlash", 447));
        data.add(new MundarijaModel("Yuqori molekulyar birikmalar hosil qilishning umumiy qoidalari", 452));
        data.add(new MundarijaModel("Glossariy", 474));


        recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));

        mundarijaAdapter = new MundarijaAdapter(mContext, data);
        mundarijaAdapter.setClickListener(this);
        recyclerView.setAdapter(mundarijaAdapter);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onItemClick(View view, int position) {
        MainActivity.defaultPage = data.get(position).getPage();

        MainActivity.toolbar.setTitle("Bosh sahifa");
        getActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.nav_host_fragment,
                        new HomeFragment())

                .commit();

        getActivity().getSupportFragmentManager().popBackStackImmediate();

        MainActivity.navPage = R.id.nav_home;


    }
}